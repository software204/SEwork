package com.workSE.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.workSE.service.SecurityService;


public class SecurityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SecurityService securityService = new SecurityService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecurityServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("进入securityServlet");
		String forward = null;
		RequestDispatcher rd = null;
		String user = request.getParameter("user");
		String password = request.getParameter("npwd");
		boolean bool=securityService.updatePassword(user, password);
		if (bool) {
			forward = "/resuccess.jsp";
		}else {
			forward = "/reerror.jsp";
		}
		rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

}
