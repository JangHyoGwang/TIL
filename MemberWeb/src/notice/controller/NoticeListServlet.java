package notice.controller;

import java.io.IOException;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;
import notice.model.vo.PageData;

/**
 * Servlet implementation class NoticeListServlet
 */
@WebServlet("/notice/list")
public class NoticeListServlet extends HttpServlet { // 사용자의 입력이나 데이터값을 Servlet에서 가져온다. (사용자와 가장 가까움.) 
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int currentPage = 1;
		if(request.getParameter("page") != null) { // 공지사항 등록을 성공하면 공지사항 목록 페이지로 이동하는데 그때 url에는 쿼리스트링이 없어서 null 오류가 났던 것이다 
//			그래서 NoticeListServlet에서 쿼리스트링 page가 없을 때 기본으로 1값을 셋셋팅을 해서 오류가 나지 않도록 함
			currentPage = Integer.parseInt(request.getParameter("page"));			
		} 
		NoticeService nService = new NoticeService();
		PageData pageData = nService.printAllNotice(currentPage);
		// 디비에 있는 것을  뿌려줘야 한다. -> 비즈니스 로직 생성 -> service dao 생성
		// db에서 가져온 nList를 noticeList.jsp에서 사용하게 해주는 코드는?
		request.setAttribute("nList", pageData.getNoticeList());
		request.setAttribute("pageNavi", pageData.getPageNavi());
		request.getRequestDispatcher("/WEB-INF/views/notice/noticeList.jsp").forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
