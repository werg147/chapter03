package com.javaex.ex05;

public class StringApp2 {

	public static void main(String[] args) {
		//String 메소드
		
		String a = new String(" abcd");
		String b = new String(",efg");
		
		//concat() 문자열 붙이기
		System.out.println(a.concat(b));
		System.out.println(a); //a 변하지않음
		
		a = a.concat(b);
		System.out.println(a);
		
		System.out.println("====================================");
		
		//trim() 문자열 앞뒤 공백제거
		a = a.trim();
		System.out.println(a);
		System.out.println("__"+a+"__"); //공백확인용
		
		a = a.replace("ab", "12,"); //문자열 바꾸기. "ab" --> "12"
		System.out.println(a);
		
		System.out.println("====================================");
		
		String[] sArr = a.split(","); //문자열 자르기
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		String str = "Hello java";
		System.out.println(str);
		
		String result01 = str.substring(3); //[3]방부터 끝까지 출력
		System.out.println(result01);
		
		String result02 = str.substring(3, 7); //[3]방부터 [7]전까지 출력 3이상7미만
		System.out.println(result02);
		
		
		
	}

}
