package com.javaex.ex10;

public class Book {
    
	/* 주의사항
		주어진  BookShop.java는 수정하지 않습니다.
		멤버변수에 초기값을 지정하지 마십시오
		Book클래스의 rent메소드에서 stateCode를 변경해야 합나다.
		Book클래스의 print메소드의 실행결과가 주어진 조건과 맞게 출력하도록 하세요
	 */
	
	
	//필드
	//변수들 초기값 지정x
	private int bookNo;  //번호
	private String title; //제목
	private String author;  //작가
	private int stateCode; //상태코드(대여 유무)
	
	
	//생성자
	//생성자는 BookShop의 main메소드를 참고하여 각 멤버변수를 초기화할 수 있도록 작업합니다. 단, stateCode는 생성자 호출 시에 1로 세팅 되도록 설정합니다.


	public Book(int bookNo, String title, String author) {
		this.stateCode = 1;
	}
	
	
	
	
	
	/*모든 메소드는 public*/
	//메소드-게터세터    
	//bookNo, title, author에 대해서는 모든 setter/getter메소드를 추가
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	
    //메소드-일반
	




	rent() : void
	print() : void
	
	/*
	rent() : 대여기능을 수행하는 메소드로 
	Book클래스의 stateCode를 0으로 변경하며  “_______이(가) 대여 됐습니다.”
	메시지가 출력되도록 작성합니다.이때 ______는 책제목이 출력되도록 작성합니다.
	
	print(): 책의 정보가 출력형태와 같이 출력될 수 있도록 작성합니다. 
	이때 대여 유무는 Book클래스의 stateCode가 1이면 “재고있음”으로 0이면 “대여중”으로 출력되도록 설정합니다.
	*/
    
    
}
