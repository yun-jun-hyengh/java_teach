package com.board.dao;

import java.util.HashMap;
import java.util.Map;

import com.board.util.ScannerUtil;
import com.board.vo.User;

public class UserDAO {
	public Map<String, User> users = new HashMap<>();
	public static User session = null;
	
	// 회원가입
	public void signup() {
		if(session != null) {
			return;
		}
		String id = ScannerUtil.nextLine("아이디 입력 >> ");
		if(users.containsKey(id)) {
			System.out.println("이미 존재하는 아이디 입니다.");
			return;
		}
		String pw = ScannerUtil.nextLine("비밀번호 입력 >> ");
		String nickname = ScannerUtil.nextLine("닉네임 입력 >> ");
		User newUser = new User(id, pw, nickname);
		users.put(id, newUser);
		System.out.println("[알림] " + id + "님, 회원가입을 축하합니다.");
	}
	
	// 로그인
	public void login() {
		String id = ScannerUtil.nextLine("아이디 입력 >> ");
		String pw = ScannerUtil.nextLine("비밀번호 입력 >> ");
		if(users.containsKey(id)) {
			User user = users.get(id);
			if(user.getPw().equals(pw)) {
				System.out.println("[" + user.getNickname() + "]님 환영합니다.");
				session = user;
			} else {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력해 주세요");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
//	// 로그인 상태 조회 
//	public boolean isLogin() {
//		return session != null;
//	}
	
	// 로그아웃
	public void logout() {
		session = null;
		System.out.println("로그아웃 되었습니다.");
	}
}
