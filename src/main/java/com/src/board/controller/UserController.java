package com.src.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.src.board.service.UserService;
import com.src.board.vo.UserVO;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/goForm")
	public String goForm() throws Exception {
		return "joinForm";
	}
	
	@PostMapping("/save")
	public void getUser(UserVO userVO) {
		userService.save(userVO);
	}
}
