package notice.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeWriteServlet
 */
@WebServlet("/notice/write")
public class NoticeWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/notice/noticeWrite.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String subject = request.getParameter("subject");
		String contents = request.getParameter("contents");
		HttpSession session = request.getSession();
		if(session != null && (session.getAttribute("memberId")) != null) {
			String noticeUserId = (String) session.getAttribute("memberId"); // object이기 때문에 형변환 필요함.
			Notice notice = new Notice();
			notice.setNoticeSubject(subject);
			notice.setNoticeContents(contents);
			notice.setNoticeUserId(noticeUserId);
			NoticeService nService = new NoticeService();
			int result = nService.registerNotice(notice);
			if(result > 0) {
				// 성공하면 성공페이지 -> 게시판 목록 페이지로 이동
				response.sendRedirect("/notice/list"); // 게시판 목록 페이지 이동을 위해서 게시판 목록 페이지 보여주는 url로 이동! / response.sendRedirect는 주소표시줄에 /notice/list 치는 것과 같음
			}else {
				// 실패하면 에러페이지
				request.getRequestDispatcher("/WEB-INF/views/notice/noticeError.html").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("/WEB-INF/views/notice/serviceFailed.html").forward(request, response);
		}
		
	}

}
