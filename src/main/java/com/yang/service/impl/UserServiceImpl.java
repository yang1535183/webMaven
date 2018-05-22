package com.yang.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yang.dao.UserInfoMapper;
import com.yang.model.UserInfo;
import com.yang.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserInfoMapper userDao;
	@Override
	public UserInfo getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}
}
