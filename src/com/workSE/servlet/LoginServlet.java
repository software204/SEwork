package com.workSE.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.workSE.service.LoginService;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private LoginService loginService = new LoginService();
       
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
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String aN = request.getParameter("accountNum");
		String ps = request.getParameter("password");
		
		RequestDispatcher rd = null;
		String forward = null;
		
		if (aN == null || ps == null) {
			request.setAttribute("msg", "用户名或密码为空");
			rd = request.getRequestDispatcher("/15/error.jsp");
			rd.forward(request, response);
		}else{
			long accountNum = Long.parseLong(aN);
			int password = Integer.parseInt(ps);
			boolean bool = loginService.check(accountNum, password);
			
			if (bool) {
				forward = "/success.jsp";
			} else {
				request.setAttribute("msg", "用户名或者密码输入错误！");
				forward = "/error.jsp";
			}
			
			rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	}

}
