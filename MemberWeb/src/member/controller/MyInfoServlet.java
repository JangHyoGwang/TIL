package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class MyInfoServlet
 */
@WebServlet("/member/myInfo")
public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// a 링크는 무조건 doGet으로 작동한다.
		String memberId = request.getParameter("memberId");
		MemberService mService = new MemberService();
		Member member = mService.selectOneById(memberId);
		if(member != null) {
			// 성공하면 마이페이지 출력
			request.setAttribute("member", member);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/member/memberMyInfo.jsp");
			view.forward(request, response);
		} else {
			// 실패하면 실패페이지
			request.getRequestDispatcher("/WEB-INF/views/member/memberError.html").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
