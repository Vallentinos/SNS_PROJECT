package com.ezen.dto;

import java.util.Date;

public class ShortsCommentVO {
	
	private int s_seq;
	private int sSeq;
	private String id;
	private String content;
	private Date indate;
	
	
	public int getS_seq() {
		return s_seq;
	}
	public void setS_seq(int s_seq) {
		this.s_seq = s_seq;
	}
	public int getsSeq() {
		return sSeq;
	}
	public void setsSeq(int sSeq) {
		this.sSeq = sSeq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getIndate() {
		return indate;
	}
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	@Override
	public String toString() {
		return "ShortsCommentVO [s_seq=" + s_seq + ", sSeq=" + sSeq + ", id=" + id + ", content=" + content
				+ ", indate=" + indate + "]";
	}
	
	

}
