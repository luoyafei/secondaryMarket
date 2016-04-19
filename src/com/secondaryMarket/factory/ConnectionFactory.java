package com.secondaryMarket.factory;

import com.secondaryMarket.database.ConnectionBuilder;
import com.secondaryMarket.database.impl.MySqlConnectionBuiler;

public class ConnectionFactory{
	public static ConnectionBuilder createMySqlConnectionBuilder(){
		return new MySqlConnectionBuiler();
	}
}
