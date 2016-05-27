package com.workSE.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.workSE.dao.AccountDao;
import com.workSE.entity.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public void save(Connection conn, Account account) throws SQLException {
		// TODO Auto-generated method stub
		String saveSql = "INSERT INTO Account(accountNum,ID,clientName,password,address,tel,openDay,principal,status) VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareCall(saveSql);
		ps.setLong(1, account.getAccountNum());
		ps.setLong(2, account.getID());
		ps.setString(3, account.getClientName());
		ps.setInt(4, account.getPassword());
		ps.setString(5, account.getAddress());
		ps.setLong(6, account.getTel());
		ps.setString(7, account.getOpenDay());
		ps.setLong(8, account.getPrincipal());
		ps.setInt(9, account.getStatus());
		ps.execute();
		System.out.println("保存成功");
	}

	@Override
	public void updatepwd(Connection conn, long accountNum, int password) throws SQLException {
		// TODO Auto-generated method stub
		String updateSql = "UPDATE Account SET password=? WHERE accountNum=?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		
		ps.setInt(1, password);
		ps.setLong(2, accountNum);
		ps.execute();
	}

	@Override
	public ResultSet get(Connection conn, long accountNum) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from Account where accountNum=?");
		ps.setLong(1, accountNum);
		
		return ps.executeQuery();
	}

	@Override
	public void updatePrincipal(Connection conn, long accountNum, long principal) throws SQLException {
		// TODO Auto-generated method stub
		String updateSql = "UPDATE Account SET principal=? WHERE accountNum=?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		
		ps.setLong(1, principal);
		ps.setLong(2, accountNum);
		ps.execute();
	}

	@Override
	public ResultSet get(Connection conn, long accountNum, int password) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from Account where accountNum=? and password=?");
		ps.setLong(1, accountNum);
		ps.setInt(2, password);
		return ps.executeQuery();
	}
	

}
