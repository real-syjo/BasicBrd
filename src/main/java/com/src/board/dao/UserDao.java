package com.src.board.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.src.board.vo.UserVO;

@Repository
@Mapper
public interface UserDao {
	void insertUser(UserVO userVO);
}
