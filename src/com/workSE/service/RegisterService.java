package com.workSE.service;

import java.sql.Connection;

import com.workSE.dao.AccountDao;
import com.workSE.entity.Account;
import com.workSE.impl.AccountDaoImpl;
import com.workSE.util.ConnectionFactory;

public class RegisterService {
	
	private AccountDao accountDao = new AccountDaoImpl();
	
	public void save(Account account) {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			accountDao.save(conn, account);
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				System.out.println("回滚");
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
	}

}
