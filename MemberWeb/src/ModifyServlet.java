package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class ModifyServlet
 */
@WebServlet("/member/update")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8"); // 넘어오는 한글이 깨지지 않도록 함. 
		// 수정하기 위해서 memberMyInfo에서 정보를 가져온다.
//		String memberPwd = request.getParameter("member-pwd"); 
//		String memberEmail = request.getParameter("member-email");
//		String memberPhone = request.getParameter("member-phone");
//		String memberAddress = request.getParameter("member-address");
//		String memberHobby = request.getParameter("member-hobby");
		Member member = new Member(); // 가져온 정보를 담을 Member객체
		// 가져온 정보를 set메소드를 통해서 private으로 선언한 변수에 저장
		member.setMemberId(request.getParameter("member-id"));
		member.setMemberPwd(request.getParameter("member-pwd"));
		member.setMemberEmail(request.getParameter("member-email"));
		member.setMemberPhone(request.getParameter("member-phone"));
		member.setMemberAddress(request.getParameter("member-address"));
		member.setMemberHobby(request.getParameter("member-hobby"));
		MemberService mService = new MemberService();
		int result = mService.modifyMember(member);
		if(result > 0) {
			// 성공하면 메인페이지
			response.sendRedirect("/index.jsp"); 
		} else {
			// 실패하면 에러페이지
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
