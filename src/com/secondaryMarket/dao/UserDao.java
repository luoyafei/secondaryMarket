package com.secondaryMarket.dao;

import com.secondaryMarket.bean.User;

public interface UserDao {
	public User getUserInId(Integer userId);
	public User getUserInName(String nackName);
	/**
	 *根据user的id属性删除删除一个user
	 *@param user 要删除的user对象
	 *@return 是否删除成功
	 */
	public boolean deleteUser(User user);	
	/**
	 * 根据pickName属性验证user是否存在,存在返回true否则返回false
	 * @param pickName user的pickName属性
	 * @return 是否存在该user
	 * */
	public boolean validateUserName(String nackName);
	/**
	 * 插入一个user对象
	 * @param user 要插入的user对象
	 * @return 是否插入成功
	 * */
	public boolean insertUser(User user);
}
