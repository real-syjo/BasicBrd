package com.src.board.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {
	private String userId;
	private String userPass;
	private String userNm;
	private String userAuth;
	private Date regDt;
	private String delYn;;
}
