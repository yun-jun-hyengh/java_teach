package com.board.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.board.util.ScannerUtil;
import com.board.vo.Board;

public class BoardDAO {
	public Map<Integer, Board> board = new HashMap<>();
	UserDAO dao = new UserDAO();
	
	public void writerBoard() {
		if(UserDAO.session == null) {
			System.out.println("로그인한 사용자만 게시글을 작성할 수 있습니다.");
			return;
		}
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		int idx = ScannerUtil.nextInt("게시글 번호 >> ");
		String writer = UserDAO.session.getNickname();
		String title = ScannerUtil.nextLine("게시글 제목 >> ");
		String content = ScannerUtil.nextLine("게시글 내용 >> ");
		String date = now.format(formatter);
		Board boardWriter = new Board(idx, writer, title, content, date);
		board.put(idx, boardWriter);
		System.out.println("[알림] " + idx + "번 게시글 등록하였습니다.");
	}
}
