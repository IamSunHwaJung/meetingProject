package party.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import party.exception.PartyException;
import party.model.service.PartyService;
import party.model.vo.Party;

/**
 * Servlet implementation class PartyDetailServlet
 */
@WebServlet("/pdetail")
public class PartyDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PartyDetailServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		// 게시글 상세보기 출력용 컨트롤러

response.setContentType("text/html; charset=utf-8");
		
		int partyno = Integer.parseInt(request.getParameter("partyno"));
		int page = Integer.parseInt(request.getParameter("page"));
		
		try {
			PartyService pService = new PartyService();
			
			//게시글 상세조회
			Party party = pService.selectParty(partyno);
			
			if(party != null){
				RequestDispatcher view = request.getRequestDispatcher("view/party/partyDetailView.jsp");
				request.setAttribute("party", party);
				request.setAttribute("currentPage", page);
				view.forward(request, response);
			}else
				throw new PartyException(party + "번 게시글 상세조회가 실패하였습니다.");
		} catch (PartyException e) {
			e.printStackTrace();
			RequestDispatcher errorPage = request.getRequestDispatcher("view/party/partyError.jsp");
			request.setAttribute("message", e.getMessage());
			errorPage.forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
