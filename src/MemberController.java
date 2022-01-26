

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("*.kh")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String requestURI = request.getRequestURI();
			System.out.println("1. " + requestURI);
			String contextPath = request.getContextPath();
			System.out.println("2. " + contextPath);
			String urlWord = requestURI.substring(contextPath.length());
			System.out.println("3. " + urlWord);
			if(urlWord.contentEquals("/registerForm.kh")) {				
				request.getRequestDispatcher("/WEB-INF/views/member/registerForm.jsp").forward(request, response);
			}else if(urlWord.contentEquals("/insertMember.kh")) {
				String memberId = request.getParameter("member-id");
				String memberPwd = request.getParameter("member-pwd");
				Member member = new Member();
				member.setMemberId(memberId);
				member.setMemberPwd(memberPwd);
				MemberDAO mDao = new MemberDAO();
				try {
					int result = mDao.registerMember(member);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				response.sendRedirect("/index.jsp");
			}else if(urlWord.contentEquals("/memberList.kh")) {
				
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
