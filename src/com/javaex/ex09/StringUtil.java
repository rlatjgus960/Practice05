package com.javaex.ex09;

public class StringUtil {
	
	private static String result=""; //생각을 좀
   
    public static String concatString(String[] strArray){
       
        //메소드 내용작성
    	for(int i = 0; i < strArray.length; i++) {
    		result = result + strArray[i];
    	}
    	
    	return result;
    }

}
