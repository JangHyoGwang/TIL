// First
package kr.or.iei.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.or.iei.model.vo.Member;

public class MemberDao {
		private final String URL = "jdbc:oracle:thin:@sonof.iptime.org:8521:XE"; 
		private final String USER = "STUDENT_HG";
		private final String PASSWORD = "STUDENT_HG";

		// JDBC 코딩해서 연결을 해야함.
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null; // int result = 0;
		List<Member> list = null;
		
		public List<Member> selectAll() {
			String query = "SELECT * FROM MEMBER";
		try {
			// 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = new ArrayList<Member>();
			while(rset.next()) { // 커서로 확인하는 구문 한번 돌때 1개 데이터를 가져옴
				Member mOne = new Member();
				String memberId = rset.getString("MEMBER_ID");
				mOne.setMemberid(memberId);
				String memberName = rset.getString("MEMBER_NAME");
				mOne.setMemberName(memberName);
				int age = rset.getInt("AGE");
				mOne.setAge(age);
				String email = rset.getString("EMAIL");
				mOne.setEmail(email);
				String phone = rset.getString("PHONE");
				mOne.setPhone(phone);
				String address = rset.getString("ADDRESS");
				mOne.setAddress(address);
				list.add(mOne); // while문이 한번 돌때마다 데이터가 리스트에 누적됨.
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rset.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}

	public Member selectOneById(String memberId) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM MEMBER WHERE MEMBER_ID = '" + memberId + "'";
		Member member = null;
		try {
			// 1. 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2. DBMS 연결
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			// 3. Statement 생성
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				member = new Member();
				String mId = rset.getString("MEMBER_ID");
				member.setMemberid(mId);
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setAge(rset.getInt("AGE"));
				member.setEmail(rset.getString("EMAIL"));
				member.setPhone(rset.getString("PHONE"));
				member.setGender(rset.getString("GENDER"));
				member.setAddress(rset.getString("ADDRESS"));
				member.setHobby(rset.getString("HOBBY"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return member;
	}

	public List<Member> selectAllByName(String memberName) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE '%" + memberName + "%'";
		List<Member> mList = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			// 여러개의 레코드를 옮겨 담야아함, Member객체, List 객체가 사용됨.
			mList = new ArrayList<Member>(); // while문 밖에서 선언한 이유는 초기화가 되지 않게하기 위해 
			while(rset.next()) {
				Member member = new Member();
				member.setMemberid(rset.getString("MEMBER_ID"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setAge(rset.getInt("AGE"));
				member.setEmail(rset.getString("EMAIL"));
				member.setPhone(rset.getString("PHONE"));
				member.setAddress(rset.getString("ADDRESS"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
				member.setHobby(rset.getString("HOBBY"));
				mList.add(member);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return mList;
	}

	public int insertMember(Member member) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String query = "INSERT INTO MEMBER VALUES(" // 홑 따옴표로 묶어줘야 문자열로 인식을 함. 
				+ "'" + member.getMemberid() + "',"
					+ "'" + member.getMemberPwd() + "',"
						+ "'" + member.getMemberName() + "',"
								+ "'" + member.getGender() + "',"
										+ "'" + member.getAge() + "',"
												+ "'" + member.getEmail() + "',"
														+ "'" + member.getPhone() + "',"
																+ "'" + member.getAddress() + "',"
																		+ "'" + member.getHobby() + "',"
																				+ "DEFAULT)";  
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int deleteMember(String memberId) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String query = "DELETE FROM MEMBER WHERE MEMBER_ID = '" + memberId + "'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

	public int updateMember(Member member) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String query = "UPDATE MEMBER SET MEMBER_PWD = '" + member.getMemberPwd() + "', ADDRESS = '" + member.getAddress() + "' WHERE MEMBER_ID = '" + member.getMemberid() + "'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}

}












