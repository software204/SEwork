package com.workSE.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.workSE.entity.Account;
import com.workSE.service.RegisterService;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private RegisterService registerService = new RegisterService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		System.out.println("进入registerServlet");
		registerService.save(initAccount(request));
	}
	
	public Account initAccount(HttpServletRequest request) {
		Account item = new Account();
		long accountNum = Long.parseLong(request.getParameter("accountNum"));
		long ID = Long.parseLong(request.getParameter("ID"));
		String clientName = request.getParameter("clientName");
		String address = request.getParameter("address");
		long tel = Long.parseLong(request.getParameter("tel"));
		int password = Integer.parseInt(request.getParameter("password"));
		long principal = Long.parseLong(request.getParameter("principal"));
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String openDay = dateFormat.format(now);
		item.setAccountNum(accountNum);
		item.setID(ID);
		item.setClientName(clientName);
		item.setAddress(address);
		item.setTel(tel);
		item.setPassword(password);
		item.setPrincipal(principal);
		item.setOpenDay(openDay);
		item.setStatus(1);
		return item;
		
	}
	

}

