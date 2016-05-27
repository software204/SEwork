package com.workSE.test;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.workSE.dao.AccountDao;
import com.workSE.entity.Account;
import com.workSE.impl.AccountDaoImpl;
import com.workSE.util.ConnectionFactory;

public class AccountDaoTest {
	public static void main(String[] args) {
		Connection conn = null;
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			AccountDao accountDao = new AccountDaoImpl();
			Account gsh = new Account();
			gsh.setAccountNum(621111l);
			gsh.setID(130582199605250419l);
			gsh.setClientName("gsh");
			gsh.setPassword(19960525);
			gsh.setAddress("xian");
			gsh.setTel(15002970749l);
			gsh.setOpenDay(dateFormat.format(now));
			gsh.setPrincipal(1000);
			gsh.setStatus(1);
			accountDao.save(conn, gsh);
			System.out.println("保存成功");
			conn.commit();
		} catch (Exception e) {
			try {
				System.out.println("事务回滚");
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
