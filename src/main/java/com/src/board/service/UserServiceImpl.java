package com.src.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.board.dao.UserDao;
import com.src.board.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(UserVO userVO) {
		userDao.insertUser(userVO);
	}

}
