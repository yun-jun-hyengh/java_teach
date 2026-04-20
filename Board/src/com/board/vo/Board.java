package com.board.vo;

import java.util.Date;

public class Board {
	private String idx; // 게시글 번호
	private String writer; // 게시글 작성자
	private String title; // 게시글 제목
	private String content; // 게시글 내용
	private Date date; // 작성일자 
	
	public Board(String idx, String writer, String title, String content, Date date) {
		this.idx = idx;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
