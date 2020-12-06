package com.javaex.ex01;

public class ObjApp {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj));
		
		
		//getClass() --> 클래스 정보
	    System.out.println("=================================");
	    System.out.println("obj.getClass()");
	    System.out.println(obj.getClass());
	    
	    //hashCode() --> 메모리의 주소값(실제는 아님)
	    System.out.println("=================================");
	    System.out.println("obj.hashCode()");
	    System.out.println(obj.hashCode());
	    
	    Object obj1 = new Object();
	    Object obj2 = new Object();
	    Object obj3 = new Object();
	    
	    System.out.println(obj1.hashCode());
	    System.out.println(obj2.hashCode());
	    System.out.println(obj3.hashCode());
	    
	    //toString() --> 객체의 값 정보
	    System.out.println("=================================");
	    System.out.println("toString()");
	    System.out.println(obj.toString());
	    
	    //equals() --> 객체(인스턴스)가 같은지 비교
	    System.out.println("=================================");
	    System.out.println("equals()");
	    System.out.println(obj.equals(obj));
	    System.out.println(obj.equals(obj1));
	    System.out.println(obj1.equals(obj3));
	    System.out.println(obj1.equals(obj1));

	}

}
