package cn.nextop.core.common.orm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.nextop.core.common.orm.dao.UserDao;
import cn.nextop.core.common.orm.po.User;

public class UserService {
	//
	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);	
	
	//
	@Autowired private UserDao userDao;
	
	/**
	 * 
	 */
	public void test() {
		List<User> r = userDao.getAll();
		for (User user : r) LOGGER.info(user.toString());
	}
}
