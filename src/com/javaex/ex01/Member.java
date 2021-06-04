package com.javaex.ex01;

public class Member {

	//필드
	private String id;
	private String name;
	private int point;
	
	
	
	
	//생성자
	
	
	//게터세터 메소드
	
	
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPoint() {
		return point;
	}




	public void setPoint(int point) {
		this.point = point;
	}




	//일반메소드
	public void showinfo() {
		System.out.println("회원정보: "+name+"("+id+"), "+point+"점");
	}
}
