package member.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import common.JDBCTemplate;
import member.model.dao.MemberDAO;
import member.model.vo.Member;

public class MemberService {
		
		private JDBCTemplate jdbcTemplate;
		private MemberDAO mDao;
		
		public MemberService() { // 기본 생성자
			mDao = new MemberDAO(); // MemberDAO 타입에 mDao 참조변수에 객체를 생성해줌.
															// 어디서 ? 그곳은 생성자
		}

	public Member selectLoginMember(String memberId, String memberPwd) {
		Connection conn = null;
		Member member = null;
		
		try {
			jdbcTemplate = JDBCTemplate.getInstance(); // 해당 코드를 작성하면 싱글톤 패톤이 적용되면서 연결을 만들게 되고 getConnection 메소드를 통해 연결을 가져올 수 있게 된
			conn = jdbcTemplate.getConnection(); // 싱글톤 패턴이 적용된 jdbTemplate를 이용해 연결 생성 
			member = mDao.selectLoginMember(conn, memberId, memberPwd); // 생성된 연결 DAO 전달
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return member;
	}

	public Member selectOneById(String memberId) {
		Connection conn = null;
		Member member = null;
		
		try {
			jdbcTemplate = JDBCTemplate.getInstance();
			conn = jdbcTemplate.getConnection();
			member = mDao.selectOneById(conn, memberId);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return member;
	}
	
	public int registerMember(Member member) { // 여기서 가져오는 멤버는 객체 정보가 담겨있음 (Servlet에서 가져옴)
		// 연결 생성
		Connection conn = null;
		int result = 0;
		try {
			jdbcTemplate = JDBCTemplate.getInstance();
			conn = jdbcTemplate.getConnection();
			// DAO 호출하면서 연결 전달
			result = mDao.insertMember(member, conn); 
			// 커밋, 롤백
			if(result > 0) {
				jdbcTemplate.commit(conn);
			} else {
				jdbcTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return result;
}

	public int modifyMember(Member member) { // mDao에 생성 및 연결할 데이터 전달하는 메소드
		Connection conn = null;
		int result = 0; // result 값이 0으로 초기화가 되기 때문에 쿼리문 실패하면 0이됨.
		try {
			jdbcTemplate = JDBCTemplate.getInstance();
			conn = jdbcTemplate.getConnection();
			result = mDao.updateMember(conn, member);
			if(result > 0) {
				jdbcTemplate.commit(conn);
			}else {
				jdbcTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return result;
	}

	public int removeMember(String memberId) {
		Connection conn = null;
		int result = 0;
		try {
			jdbcTemplate = JDBCTemplate.getInstance();
			conn = jdbcTemplate.getConnection();
			result = mDao.deleteMember(conn, memberId);
			if(result > 0) {
				jdbcTemplate.commit(conn);
			}else {
				jdbcTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return result;
	}


	
}
