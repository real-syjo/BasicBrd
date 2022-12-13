package com.src.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

	@RequestMapping("/goLogin")
	public String goLogin() throws Exception {
		return "login";
	}

}
