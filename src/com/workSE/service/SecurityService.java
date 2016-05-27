package com.workSE.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.workSE.dao.AccountDao;
import com.workSE.impl.AccountDaoImpl;
import com.workSE.util.ConnectionFactory;

public class SecurityService {
	
	private AccountDao accountDao = new AccountDaoImpl();
	
	public boolean updatePassword(String aN,String pwd) {
		Connection conn = null;
		long accountNum = Long.parseLong(aN);
		int password = Integer.parseInt(pwd);
		
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet rs = accountDao.get(conn, accountNum);
			while(rs.next()){
				accountDao.updatepwd(conn, accountNum, password);
				conn.commit();
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
