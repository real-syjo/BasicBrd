package com.src.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.src.board.dao.BoardDao;


@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardDao  boardDao;

	
	
}
