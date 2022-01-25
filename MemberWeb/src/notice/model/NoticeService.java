package notice.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import common.JDBCTemplate;
import notice.model.dao.NoticeDAO;
import notice.model.vo.Notice;
import notice.model.vo.PageData;

public class NoticeService { // db 연결 생성 -> 생성된 연결을 DAO에 넘겨주는 역할 -> DML경우 Commit/Rollback을 한다.
	
	private JDBCTemplate jdbcTemplate;
	private NoticeDAO nDao;
	
	public NoticeService() {
		jdbcTemplate = JDBCTemplate.getInstance();
		nDao = new NoticeDAO();
	}
	
	public PageData printAllNotice(int currentPage) {
//	 	1. db 연결 생성 하고
//		2. select 경우 Arraylist 변수 선언해서
//		3. DAO에 연결 전달하고 리턴값 받아서
//		4. servlet으로 전달		
		Connection conn = null;
		ArrayList<Notice> nList = null;
		PageData pageData = new PageData();
		try {
			conn = jdbcTemplate.getConnection();
			nList = nDao.selectAllNotice(conn, currentPage);
			String result = nDao.getPageNavi(conn, currentPage);
			pageData.setNoticeList(nList);
			pageData.setPageNavi(result);
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return pageData;
	}
	
	public Notice printOneByNo(int noticeNo) {
		Connection conn = null;
		Notice notice = null;
		try {
			conn = jdbcTemplate.getConnection();
			notice = nDao.selectOneByNo(conn, noticeNo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return notice;
	}

	public int registerNotice(Notice notice) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.getConnection();
			result = nDao.insertNotice(conn, notice);
			if(result > 0) {
				jdbcTemplate.commit(conn);
			}else {
				jdbcTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			jdbcTemplate.close(conn);
		}
		return result;
	}

	public int removeNotice(int noticeNo) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.getConnection();
			result = nDao.deleteNotice(conn, noticeNo);
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

	public int modifyNotice(Notice notice) {
		Connection conn = null;
		int result = 0;
		try {
			conn = jdbcTemplate.getConnection();
			result = nDao.updateNoitce(conn, notice);
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
