package com.workSE.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.workSE.dao.AccountDao;
import com.workSE.impl.AccountDaoImpl;
import com.workSE.util.ConnectionFactory;

public class DepositService {
	
	private AccountDao accountDao = new AccountDaoImpl();
	
	public boolean updatePrincipal(String aN,String pp) {
		Connection conn = null;
		long accountNum = Long.parseLong(aN);
		long addPrincipal = Long.parseLong(pp);
		
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet rs = accountDao.get(conn, accountNum);
			while(rs.next()){
				long principal = rs.getLong("principal");
				principal+=addPrincipal;
				accountDao.updatePrincipal(conn, accountNum, principal);
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
