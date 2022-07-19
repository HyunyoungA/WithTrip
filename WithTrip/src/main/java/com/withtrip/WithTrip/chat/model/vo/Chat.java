package com.withtrip.WithTrip.chat.model.vo;

import java.sql.Date;

public class Chat {
	private int chatRoomNo; //채팅방번호
	private String email; //이메일
	private int chatNo; //채팅글번호
	private String chatContent;//채팅내용
	private Date chatCreateDate; //채팅날짜
	
	public Chat() {}
	
	public Chat(int chatRoomNo, String email, int chatNo, String chatContent, Date chatCreateDate) {
		super();
		this.chatRoomNo = chatRoomNo;
		this.email = email;
		this.chatNo = chatNo;
		this.chatContent = chatContent;
		this.chatCreateDate = chatCreateDate;
	}
	public int getChatRoomNo() {
		return chatRoomNo;
	}
	public void setChatRoomNo(int chatRoomNo) {
		this.chatRoomNo = chatRoomNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getChatNo() {
		return chatNo;
	}
	public void setChatNo(int chatNo) {
		this.chatNo = chatNo;
	}
	public String getChatContent() {
		return chatContent;
	}
	public void setChatContent(String chatContent) {
		this.chatContent = chatContent;
	}
	public Date getChatCreateDate() {
		return chatCreateDate;
	}
	public void setChatCreateDate(Date chatCreateDate) {
		this.chatCreateDate = chatCreateDate;
	}
	@Override
	public String toString() {
		return "Chat [chatRoomNo=" + chatRoomNo + ", email=" + email + ", chatNo=" + chatNo + ", chatContent="
				+ chatContent + ", chatCreateDate=" + chatCreateDate + "]";
	}
	
}