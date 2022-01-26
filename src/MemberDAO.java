import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class MemberDAO {
	
	// 1. 싱글톤
	private static MemberDAO instance;
	
	public static MemberDAO getInstance() { 
		if(instance != null) {
			instance = new MemberDAO();
		}
		return instance;
	}

	// 2. DBCP 적용 -> 연결 풀 만들어서 재사용하는 것, 하기 위해서 사용했던 클래스, BasicDataSource
	private BasicDataSource dataSource = new BasicDataSource();
	
	public MemberDAO() {
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@sonof.iptime.org:8521:XE");
		dataSource.setUsername("SPRING_HG");
		dataSource.setPassword("SPRING_HG");
		dataSource.setInitialSize(30);
	}
	
	public Connection getConnecton() throws SQLException {
		return dataSource.getConnection();
	}
	
	public int registerMember(Member member) throws SQLException {
		
		
		Connection conn = this.getConnecton();
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO MEMBER_TBL VALUES(?, ?, '홍길동', 'kh@naver.com', 01022028265', '서울', DEFAULT, DEFAULT, DEFAULT";
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@sonof.iptime.org:8521:XE", "SPRING_HG", "SPRING_HG");
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			result = pstmt.executeUpdate();
			if(result > 0) {				
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
