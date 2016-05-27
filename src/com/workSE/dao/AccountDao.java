package com.workSE.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.workSE.entity.Account;

public interface AccountDao {
	public void save(Connection conn,Account account) throws SQLException;
	public void updatepwd(Connection conn,long accountNum,int password) throws SQLException;
	public void updatePrincipal(Connection conn,long accountNum,long principal) throws SQLException;

	public ResultSet get(Connection conn,long accountNum) throws SQLException;
	public ResultSet get(Connection conn,long accountNum,int password) throws SQLException;
}
