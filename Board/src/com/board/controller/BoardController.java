package com.board.controller;

import com.board.dao.BoardDAO;
import com.board.dao.UserDAO;
import com.board.util.ScannerUtil;

public class BoardController {
	
	public static void main(String[] args) {
		UserDAO userDao = new UserDAO();
		BoardDAO boardDao = new BoardDAO();
		
		while(true) {
			System.out.println("========== 메뉴선택 ==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 게시글 작성");
			System.out.println("4. 게시글 목록");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 게시글 수정");
			System.out.println("7. 로그아웃");
			System.out.println("8. 프로그램 종료");
			System.out.println("============================");
			
			int choice = ScannerUtil.nextInt("메뉴선택 >> ");
			if(choice == 1) {
				userDao.signup();
			} else if(choice == 2) {
				userDao.login();
			} else if(choice == 3) {
				boardDao.writerBoard();
			} else if(choice == 4) {
				boardDao.boardList();
			} else if(choice == 5) {
				boardDao.boardDelete();
			} else if(choice == 6) {
				boardDao.boardUpdate();
			} else if(choice == 7) {
				userDao.logout();
			} else if(choice == 8) {
				System.out.println("프로그램 종료");
				ScannerUtil.close();
				break;
			}
		}
	}
}
