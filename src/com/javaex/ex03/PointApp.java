package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(2, 3);
		Point p01 = new Point(2, 3);
		Point p02 = new Point(5, 8);

		//전제 x값과 y값이 모두 같으면 "같다"라고 정의
		// p == p01   ,   p !=p02
		
		System.out.println(p.equals(p01));
		System.out.println(p.equals(p02));
	}

}
