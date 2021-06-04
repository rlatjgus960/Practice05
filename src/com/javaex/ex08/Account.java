package com.javaex.ex08;

public class Account {

    private String accountNo;  //얘는....왜....?
    private int balance;
    
    private int deposit;
    private int withdraw;
    
    //생성자 작성
    public Account (String accountNo) {
    	System.out.println(accountNo+" 계좌가 개설되었습니다.");
    	
    }
    
    //필요한 메소드 작성

    public void deposit(int deposit) {
    	this.deposit = deposit;
    	this.balance = this.balance + this.deposit;
    }
    
    public void withdraw(int withdraw) {
    	this.withdraw = withdraw;
    	this.balance = this.balance - this.withdraw;
    }
    
    public void showBalance () {
    	System.out.println(balance);
    }

}
