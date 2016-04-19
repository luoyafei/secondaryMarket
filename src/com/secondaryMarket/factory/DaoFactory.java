package com.secondaryMarket.factory;

import com.secondaryMarket.dao.UserDao;
import com.secondaryMarket.dao.impl.UserMysqlDao;

public class DaoFactory {
	public static UserDao createUserDao(){
		return new UserMysqlDao();
	}
}
