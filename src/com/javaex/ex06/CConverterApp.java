package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

    	/* 얘넨 왜?
        double dollar;
        double won;
        */
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.println("백만원은 "+CConverter.toDoller(1000000)+"달러입니다.");
       
    	
        
        //100달러를 원으로 출력하기
        System.out.println("백만원은 "+CConverter.toKWR(100)+"원입니다.");
        
    }

}
