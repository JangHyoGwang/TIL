package notice.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import common.JDBCTemplate;
import notice.model.vo.Notice;

public class NoticeDAO { // Service에서 넘겨 받은 정보로 쿼리문 작성하여 실행(비즈니스 로직 마지막 단계)

	public ArrayList<Notice> selectAllNotice(Connection conn, int currentPage) {
		PreparedStatement pstmt = null;
		ResultSet rset = null; // select의 경우
		ArrayList<Notice> nList = null;
		String query = "SELECT * FROM (SELECT ROW_NUMBER() OVER(ORDER BY NOTICE_NO DESC) AS NUM, NOTICE_TBL.* FROM NOTICE_TBL)WHERE NUM BETWEEN ? AND ?";
		// 전체 데이터를 가져오는게 아니라 10개씩, 또는 5개씩 끊어서 가져오기 위해서 쿼리문 바꿨어요 인라인뷰를 사용한거에요
		try {
			pstmt = conn.prepareStatement(query);
			int recordCountPerPage = 5;
			int start = currentPage * recordCountPerPage - (recordCountPerPage - 1);
			int end = currentPage * recordCountPerPage;
			// 현재 페이지 1
			// start : 1, end : 10
			// start -> 1 * 10 - 9
			// 현재 페이지 2
			// start : 11, end : 20
			// start -> 2 * 10 - 9
			// 현재 페이지 3
			// start : 21, end : 30
			// start - > 3 * 10 - 9
			// currentPage라고 하는 변수에 값에 따라서 start, end 값이 달라진다.
			// start, end값은 규칙이 있음
			// start는 1, 11, 21, 31, 41, 51, .... 1로 끝나는 규칙
			// end는 10, 20, 30, 40, ... 10단위로 증가
			// currentPage에 의해서 만들어지기 때문에 currentPage값과 한페이지당 보여주는 게시물의 수를 통해서
			// 계산식을 만든 것이 23, 24줄 식임
			// currentPage 값은 사용자에 의해서 바뀌어 되기 때문에 매개변수로 설정
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rset = pstmt.executeQuery();
			nList = new ArrayList<Notice>();
			while (rset.next()) { // 리스트의 경우 rset에는 여러개의 행을 가져온 상태이기 때문에 while문을 이용해서 모든 행에 데이터를 가져와야함
				Notice notice = new Notice(); // while안에서 객체를 하나 생성해서 rset에 있는 데이터를 notice 객체 담고 nlist에 추가를 해줌
				notice.setNoticeNo(rset.getInt("NOTICE_NO"));
				notice.setNoticeSubject(rset.getString("NOTICE_SUBJECT"));
				notice.setNoticeContents(rset.getString("NOTICE_CONTENTS"));
				notice.setNoticeUserId(rset.getString("NOTICE_USERID"));
				notice.setNoticeDate(rset.getDate("NOTICE_DATE"));
				nList.add(notice); //
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return nList;
	}
	
	// pageNavi에 해당하는 부분을 태그로 된 문자열로 만들어서 화면단에 넘겨주고 화면단에서는 태그로 동작할 수 있도록 함 
	
	public String getPageNavi(Connection conn, int currentPage) {
		int recordTotalCount = this.totalCount(conn);  // 아래 메소드 전체 개시물의 개수를 전달 받아서 사용  // 전체 게시물의 개수 
		int recordCountPerPage = 5;       // 한 페이지 당 보여주는 게시물의 개수
		
		int pageNaviTotalCount = 0;        // 전체 pageNavi의 개수
		if(recordTotalCount % recordCountPerPage > 0) { // 전체 게시물의 개수의 1의 자리가 0보다 크다면 
			pageNaviTotalCount = recordTotalCount / recordCountPerPage + 1;			
		} else {
			pageNaviTotalCount = recordTotalCount / recordCountPerPage;						
		}
		// 오류방지 코드
		if(currentPage < 1) {
			currentPage = 1;
		}else if(currentPage > pageNaviTotalCount) { // 전체 pageNavi 개수 보다 큰 숫자가 들어온다면 
			currentPage = pageNaviTotalCount;
		}
		int pageNaviCountPerPage = 5;  // 현재 페이지에서의 최대 pageNavi 개수 
		
		int startNavi = ((currentPage - 1) / pageNaviCountPerPage) * pageNaviCountPerPage + 1;        // pageNavi 시작 숫자, 현재 페이지 값에 따라 달라진다. 
		int endNavi = startNavi + pageNaviCountPerPage -1;                           // pageNavi 끝 숫자
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 오류 방지 코드
		if(endNavi > pageNaviTotalCount) { // 최대 값을 넘는 값이 endNavi 값으로 들어온다면
			endNavi = pageNaviTotalCount;
		}
		boolean needPrev = true;     // 첫번째 pageNavi에서는 이전 버튼 안눌리게
		boolean needNext = true;     // 마지막 pageNavi에서 다음 버튼 안눌리게
		if(startNavi == 1) { // 현재 페이지가 첫번째 페이지라면
			needPrev = false;
		}
		if(endNavi == pageNaviTotalCount) { 
			needNext = false;
		}
		StringBuilder sb = new StringBuilder(); // String을 쭉이어 붙여줌 - > 시작 값 마지막 값의 사이 값을 채워준다. 
		if(needPrev) { // 이전버튼은 맨마지막에 있는 값보다 1적고
			sb.append("<a href='/notice/list?page=" + (startNavi-1) + "'> [이전] </a>");
		}
		for(int i = startNavi; i <= endNavi; i++) {
//			sb.append("<a href='/notice/list?page=" + i +"'>" + i + " </a>"); // 태그로 된 문자열이 sb에 들어가게 된다. 
			sb.append("<a href='/notice/list?page=" + i + "'> "+i+" </a>");
		}
//		이전 버튼은 맨처음에 있는 값보다 1적어야 되고 다음버튼은 맨마지막에 있는 값보다 1커야 함
		// needPrev, needNext를 작성한 후, selectAllNotice()메소드에서 recordCountPerPage = 10 -> 5 getPageNavi()메소드에서 recordCountPerPage = 10 -> 5 
		if(needNext) {
			sb.append("<a href='/notice/list?page=" + (endNavi+1) + "'> [다음] </a>");
		}
		return sb.toString();
	}
	
	// 그런데 이때 토탈카운트가 필요합니다 토탈카운트는 전체게시물의 갯수입니다
	// 전체 게시물의 갯수 값을 알아야 pageNavi의 수를 알 수가 있음 23개면 10개씩 보여줬을 때 pageNavi는 3개
	// 전체 게시물의 갯수가 56개면 10개씩 보여줬을 때 pageNavi는 6개
	
	public int totalCount(Connection conn) {
		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT COUNT(*)  AS TOTALCOUNT FROM NOTICE_TBL";
		int result = 0;
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			if(rset.next()) {
				// rset -> int
				result = rset.getInt("TOTALCOUNT");
//				현재 쿼리문의 결과값은 마땅한 컬럼이 없기 때문에
//				1. 컬럼명 별칭을 지정해주거나
//				2. 컬럼명없이 인덱스로 값을 가져온다.
//				result = rset.getInt(1);
//				rset.getInt(1);는 rset에서 첫번째 컬럼의 데이터를 가져오는 메소드입니다.
//				rset -> int에다가 넣고 싶으면??
//				뭐라고 써야해요?
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return result;
	}
	
	public Notice selectOneByNo(Connection conn, int noticeNo) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Notice notice = null;
		String query = "SELECT * FROM NOTICE_TBL WHERE NOTICE_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			rset = pstmt.executeQuery();
			// 쿼리문을 작성하고 위치홀더에 값을 세팅하고 쿼리문이 실행되어 넘어온 상황.
			// 현재 rset에 데이터가 저장 되어있는 상태
			// rset에 넘어온 데이터는 notice로 옮긴다.
			if (rset.next()) {
				// rset에 있는 값을 notice로 옮기기 위해 초기화를 한다.
				// rset -> notice 로 옮기기 위해서는 notice 객체의 setter 메소드 이용!
				notice = new Notice();
				notice.setNoticeNo(rset.getInt("NOTICE_NO"));
				notice.setNoticeSubject(rset.getString("NOTICE_SUBJECT"));
				notice.setNoticeContents(rset.getString("NOTICE_CONTENTS"));
				notice.setNoticeUserId(rset.getString("NOTICE_USERID"));
				notice.setNoticeDate(rset.getDate("NOTICE_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return notice;
	}

	public int insertNotice(Connection conn, Notice notice) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "INSERT INTO NOTICE_TBL VALUES(SEQ_NOTICE_NO.NEXTVAL, ?, ?, ?, DEFAULT)";
		try {
			pstmt = conn.prepareStatement(query);
			// 위치홀더에 맞게 set으로 가져오기
			pstmt.setString(1, notice.getNoticeSubject());
			pstmt.setString(2, notice.getNoticeContents());
			pstmt.setString(3, notice.getNoticeUserId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public int deleteNotice(Connection conn, int noticeNo) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "DELETE FROM NOTICE_TBL WHERE NOTICE_NO = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, noticeNo);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	public int updateNoitce(Connection conn, Notice notice) {
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE NOTICE_TBL SET NOTICE_SUBJECT = ?, NOTICE_CONTENTS = ? WHERE NOTICE_NO = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, notice.getNoticeSubject());
			pstmt.setString(2, notice.getNoticeContents());
			pstmt.setInt(3, notice.getNoticeNo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

}
