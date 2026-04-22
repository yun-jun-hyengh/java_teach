package com.board.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.board.util.ScannerUtil;
import com.board.vo.Board;

public class BoardDAO {
	public Map<Integer, Board> board = new HashMap<>();
	UserDAO dao = new UserDAO();
	public int nextIdx = 1;
	
	// 게시글 작성 
	public void writerBoard() {
		if(UserDAO.session == null) {
			System.out.println("로그인한 사용자만 게시글을 작성할 수 있습니다.");
			return;
		}
		if(!board.isEmpty()) {
			int maxKey = 0;
			for(int key : board.keySet()) {
				if(key > maxKey) {
					maxKey = key;
				}
			}
			nextIdx = maxKey + 1;
		}
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		int idx = nextIdx;
		String user_id = UserDAO.session.getId();
		String writer = UserDAO.session.getNickname();
		String title = ScannerUtil.nextLine("게시글 제목 >> ");
		String content = ScannerUtil.nextLine("게시글 내용 >> ");
		String date = now.format(formatter);
		Board boardWriter = new Board(idx, user_id, writer, title, content, date);
		board.put(idx, boardWriter);
		System.out.println("[알림] " + idx + "번 게시글 등록하였습니다.");
	}
	
	
	// 게시글 조회 
	public void boardList() {
		System.out.println("=".repeat(110));
		System.out.printf("%-5s | %-20s | %-10s | %-40s | %-10s\n", "번호", "제목", "작성자", "내용", "작성일");
		if(board.isEmpty()) {
			System.out.println("등록된 게시글이 없습니다.");
		} else {
			List<Integer> keySet = new ArrayList<>(board.keySet());
			keySet.sort(Collections.reverseOrder());
			for(int key : keySet) {
				Board b = board.get(key);
				System.out.printf("%-5s | %-20s | %-10s | %-40s | %-10s\n", 
						b.getIdx(), b.getTitle(), b.getWriter(), b.getContent(), b.getDate());
			}
		}
	}
	
	// 게시글 삭제 
	public void boardDelete() {
		if(UserDAO.session == null) {
			System.out.println("로그인을 하지 않았습니다. 로그인을 진행해 주세요");
			return;
		}
		int idx = ScannerUtil.nextInt("삭제할 게시글 번호 >> ");
		if(!board.containsKey(idx)) {
			System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
			return;
		}
		Board b = board.get(idx);
		if(!b.getUser_id().equals(UserDAO.session.getId())) {
			System.out.println("본인이 작성한 글만 삭제할 수 있습니다.");
			return;
		}
		board.remove(idx);
		System.out.println("[" + idx + "]번 게시글이 삭제되었습니다.");
	}
	
	// 게시글 수정 
	public void boardUpdate() {
		if(UserDAO.session == null) {
			System.out.println("로그인을 하지 않았습니다. 로그인을 진행해 주세요");
			return;
		}
		int idx = ScannerUtil.nextInt("수정할 게시글 번호 >> ");
		if(!board.containsKey(idx)) {
			System.out.println("해당 번호의 게시글이 존재하지 않습니다.");
			return;
		}
		
		Board bo = board.get(idx);
		if(!bo.getUser_id().equals(UserDAO.session.getId())) {
			System.out.println("본인이 작성한 글만 수정할 수 있습니다.");
			return;
		}
		
		String newTitle = ScannerUtil.nextLine("수정할 제목 입력 >> ");
		String newContent = ScannerUtil.nextLine("수정할 내용 입력 >> ");
		Board updateBoard = new Board(idx, bo.getUser_id(), bo.getWriter(), 
				newTitle, newContent, bo.getDate());
		board.put(idx, updateBoard);
		System.out.println("[" + idx + "]번 게시글이 수정완료되었습니다.");
	}
}
