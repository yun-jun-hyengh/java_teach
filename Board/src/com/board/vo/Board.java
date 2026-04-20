package com.board.vo;

import java.util.Date;

public class Board {
	private int idx; // 게시글 번호
	private String writer; // 게시글 작성자
	private String title; // 게시글 제목
	private String content; // 게시글 내용
	private String date; // 작성일자 
	
	public Board(int idx, String writer, String title, String content, String date) {
		this.idx = idx;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
