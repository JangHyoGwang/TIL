package member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Member; // set하기 위한 임포트

/**
 * Servlet implementation class EnrollServlet
 */
@WebServlet("/member/enroll")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 입력한 값 가져올때 한글 깨짐
		MemberService mService = new MemberService();
		Member member = new Member(); 
		String userId = request.getParameter("user-id");
		String userPw = request.getParameter("user-pwd");
		String userName = request.getParameter("user-name");
		int userAge = Integer.parseInt(request.getParameter("user-age"));
		String userEmail = request.getParameter("user-email");
		String userPhone = request.getParameter("user-phone");
		String userAddress = request.getParameter("user-address");
		String gender = request.getParameter("gender");
		String userHobby = request.getParameter("user-hobby");
		member.setMemberId(userId);
		member.setMemberPwd(userPw);
		member.setMemberName(userName);
		member.setMemberAge(userAge);
		member.setMemberEmail(userEmail);
		member.setMemberPhone(userPhone);
		member.setMemberAddress(userAddress);
		member.setMemberGender(gender);
		member.setMemberHobby(userHobby);
		// service - dao (SQL 전송)
		int result = mService.registerMember(member);
		if(result > 0) {
			// 성공하면 로그인 페이지
			// 1. RequestDispatcher
			// 2. sendRedirect -> 데이터를 가져가지 못함.. 단순한 페이지 이동
			response.sendRedirect("/index.jsp");
		} else {
			// 실패하면 오류 페이지
			request.getRequestDispatcher("/WEB-INF/views/member/memberError.html").forward(request, response); // method chaining
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
