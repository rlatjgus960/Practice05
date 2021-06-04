package com.javaex.ex02;

public class Goods {

	 private String name;
	 private int price;
	 
	 public Goods() {
		 //아래 생성자가 있어서 디폴트생성자가 사라졌기 때문에 추가해줌
	 }
	 
	 public Goods(String name, int price) {
		 this.name = name;
		 this.price = price;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void showInfo() {
		System.out.println("상품명:"+name+", 가격:"+price);
	}
	 
	 

}




