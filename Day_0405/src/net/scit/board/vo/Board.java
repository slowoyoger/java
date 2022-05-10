package net.scit.board.vo;

import java.util.Date;

public class Board {
	// 멤버변수 == 인스턴스 변수
	private int seqno; // 글번호
	private String writer;
	private String title;
	private String content;
	private Date regdate; // date하고 오류나면 컨트롤 스페이스 ==> Date.util
	private int hitcount;
	private String attachfile; // 첨부파일명

	// 기본 생성자 //Board board = new Board(); 하기 위한
	public Board() {
	}

	// 오버로드 생성자(편하려고 만든다)
	public Board(int seqno, String writer, String title, String content, Date regdate, int hitcount, String attchfile) { // 얘네는
																															// 지역변수.
		this.seqno = seqno;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hitcount = hitcount;
		this.attachfile = attachfile;

	}

	// setter/getter
	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}
	public int getSeqno() {
		return this.seqno;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getRegdate() {
		return this.regdate;
	}
	public void setAttachfile(String attachfile) {
		this.attachfile = attachfile;
	}
	public String getAttachfile() {
		return this.attachfile;
	}

}