package com.workSE.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.workSE.service.DepositService;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DepositService depositService = new DepositService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepositServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("进入registerServlet");
		String forward = null;
		RequestDispatcher rd = null;
		String aN = request.getParameter("accountNum");
		String pp = request.getParameter("money");
		boolean bool=depositService.updatePrincipal(aN, pp);
		if (bool) {
			forward = "/desuccess.jsp";
		}else {
			forward = "/deerror.jsp";
		}
		rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}
	

}
