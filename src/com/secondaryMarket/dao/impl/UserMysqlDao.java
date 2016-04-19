package com.secondaryMarket.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.secondaryMarket.bean.User;
import com.secondaryMarket.dao.UserDao;
import com.secondaryMarket.factory.ConnectionFactory;

public class UserMysqlDao implements UserDao{
	private Connection connection = ConnectionFactory.createMySqlConnectionBuilder().getConnection();
	@Override
	public User getUserInId(Integer userId) {
		String sql = "select * from user where userId=?";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			rs.last();
			if(rs.getRow()<1){
				return null;
			}else{
				rs.first();
				User user = new User();
				user.setUserEmail(rs.getString("userEmail"));
				user.setUserId(userId);
				user.setUserNackName(rs.getString("userNackName"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserQQ(rs.getString("userQQ"));
				user.setUserRealName(rs.getString("userRealName"));
				user.setUserRole(rs.getString("userRole"));
				user.setUserSchool(rs.getString("userSchool"));
				user.setUserTel(rs.getString("userTel"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User getUserInName(String realName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateUserName(String realName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
