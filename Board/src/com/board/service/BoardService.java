package com.board.service;

import com.board.util.ScannerUtil;

public class BoardService {
	
	public static void signUp() {
		String id = ScannerUtil.nextLine("아이디 >> ");
		String pw = ScannerUtil.nextLine("비밀번호 >> ");
		String nickName = ScannerUtil.nextLine("닉네임 >> ");
	}
}
