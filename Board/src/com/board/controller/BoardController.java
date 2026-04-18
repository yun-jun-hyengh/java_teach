package com.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.board.util.ScannerUtil;
import com.board.vo.User;

public class BoardController {
	public static Map<String, User> users = new HashMap<>();
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("========== 메뉴선택 ==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 게시글 작성");
			System.out.println("4. 게시글 목록");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 게시글 수정");
			System.out.println("7. 종료");
			System.out.println("============================");
			
			int choice = ScannerUtil.nextInt("메뉴선택 >> ");
			if(choice == 1) {
				
			} else if(choice == 2) {
				
			} else if(choice == 3) {
				
			} else if(choice == 4) {
				
			} else if(choice == 5) {
				
			} else if(choice == 6) {
				
			} else if(choice == 7) {
				System.out.println("프로그램 종료");
				ScannerUtil.close();
				break;
			}
		}
	}
}
