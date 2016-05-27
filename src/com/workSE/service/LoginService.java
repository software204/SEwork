package com.workSE.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.workSE.dao.AccountDao;
import com.workSE.impl.AccountDaoImpl;
import com.workSE.util.ConnectionFactory;


public class LoginService {
	private AccountDao userDao = new AccountDaoImpl();
	
	public boolean check(long accountNum,int password) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet resultSet = userDao.get(conn, accountNum,password);
			
			while(resultSet.next()){
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}finally {
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return false;
		
	}
}
