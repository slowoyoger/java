package net.scit.board.vo;

import java.util.Date;

public class Board {
	// ������� == �ν��Ͻ� ����
	private int seqno; // �۹�ȣ
	private String writer;
	private String title;
	private String content;
	private Date regdate; // date�ϰ� �������� ��Ʈ�� �����̽� ==> Date.util
	private int hitcount;
	private String attachfile; // ÷�����ϸ�

	// �⺻ ������ //Board board = new Board(); �ϱ� ����
	public Board() {
	}

	// �����ε� ������(���Ϸ��� �����)
	public Board(int seqno, String writer, String title, String content, Date regdate, int hitcount, String attchfile) { // ��״�
																															// ��������.
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