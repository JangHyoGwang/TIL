package member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/member/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId = request.getParameter("member-id");
		String memberPwd = request.getParameter("member-pwd");
		MemberService mService = new MemberService();
		// SELECT * FROM MEMBER_TBL_HG WHERE MEMBER_ID = "+memberId+" AND MEMBER_PWD = "+memberPwd+"; 
		Member member = mService.selectLoginMember(memberId, memberPwd); // 들어온 아이디와 비밀번호를 가져온다.
		if(member != null) {
			// 로그인 성공
			// 세션에서 정보 저장, 세션은 파기할때까지 정보 유지
			// 어느 페이지에서든지 접근 가능
			HttpSession session  = request.getSession();
			session.setAttribute("memberId", member.getMemberId());
			session.setAttribute("memberName",member.getMemberName());
			request.getRequestDispatcher("/WEB-INF/views/member/loginSuccess.jsp").forward(request, response); 
		} else {
			// 로그인 실패!!
			// memberError.html로 이동
			request.getRequestDispatcher("/WEB-INF/views/member/memberError.html").forward(request, response); // getRequestDispatcher가 내가 지정한 페이지로 이동한다. 
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
