package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        
        
        for (int i=0; i<friendArray.length; i++) {
        	
        	System.out.print("이름: ");// 친구정보(이름) 입력받기
        	String name = sc.nextLine();
        	
        	System.out.print("핸드폰: ");// 친구정보(핸드폰) 입력받기
        	String hp = sc.nextLine();
        	
        	System.out.print("학교: ");// 친구정보(학교) 입력받기
        	String school = sc.nextLine(); 
     
        	Friend f01 = new Friend(); // Friend 인스턴스 생성하여 데이터 넣기
        	f01.setName(name);   
        	f01.setHp(hp);
        	f01.setSchool(school);
        	
        	
        	friendArray[i] = f01; // 인스턴스 주소를 배열에 대입
            

        	
        	System.out.println("--------------------------");

        }
           
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
