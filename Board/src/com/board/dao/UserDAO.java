package com.board.dao;

import java.util.HashMap;
import java.util.Map;

import com.board.util.ScannerUtil;
import com.board.vo.User;

public class UserDAO {
	public static Map<String, User> users = new HashMap<>();
	
	public static void signup() {
		String id = ScannerUtil.nextLine("아이디 입력 >> ");
		String pw = ScannerUtil.nextLine("비밀번호 입력 >> ");
		
	}
	
	public static void login() {
		
	}
}
