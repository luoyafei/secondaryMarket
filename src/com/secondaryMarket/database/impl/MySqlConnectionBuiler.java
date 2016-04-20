package com.secondaryMarket.database.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.secondaryMarket.database.ConnectionBuilder;

public class MySqlConnectionBuiler implements ConnectionBuilder{

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			InitialContext ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:/comp/env/jdbc/MySQL");
			conn = ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
