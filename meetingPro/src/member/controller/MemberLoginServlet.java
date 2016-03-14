package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import member.exception.MemberException;
import member.model.service.MemberService;
import member.model.vo.Member;


/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/mlogin")
public class MemberLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public MemberLoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 1. 전송값에 한글이 있을 경우, 문자 인코딩 처리
		request.setCharacterEncoding("utf-8");
		// 2. 응답할 데이터에 한글이 있을 경우에 대한 인코딩처리
		response.setContentType("text/html; charset=utf-8");

		// 3. 전송값이 있을 경우, 전송값 꺼내기
		String uid = request.getParameter("uid");
		String upwd = request.getParameter("upwd");

		//4. 값의 갯수가 많을 경우에는 vo 객체에 저장함
		//5. 추출한 값을 모델로 넘기고, 처리 결과를 받음
		try {
			Member loginMember = new MemberService().loginCheck(uid, upwd);
			
			//로그인 성공시 로그인 상태관리를 위한 세션 객체를 생성해야 함
			HttpSession session = request.getSession();
			//System.out.println(loginMember.getMemberName() + " : " + session.getId());
			session.setAttribute("loginMember", loginMember);
			
			//6. 받은 결과에 따라서 뷰를 선택해서 클라이언트로 응답 처리함
			RequestDispatcher view = request.getRequestDispatcher("index.jsp");
			view.forward(request, response);
			
			//response.sendRedirect("/first/index.jsp");
			
			//MemberException?
		} catch (Exception e) {
			RequestDispatcher view = request.getRequestDispatcher("view/member/error.jsp");
			request.setAttribute("code", "loginFail");
			request.setAttribute("message", e.getMessage());
			view.forward(request, response);
		}
		
	}

}