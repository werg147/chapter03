package com.javaex.ex03;

public class Point {

	//필드
	private int x;
	private int y;

	//생성자
	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//메소드 g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	//메소드 일반
	public void showInfo() {
		System.out.println("x: " + x + ",    y: " + y);
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	//Point의 "같다"를 재정의한것
	@Override
	public boolean equals(Object obj) {
		//x값이 같고, y값이 같으면 true
		//아니면 false
		Point target = (Point)obj;
		//if(this.x == ((Point)obj).x) --> 시선을 Point까지 넓혀주어야 x값에 도달할 수 있으므로 형변환
		
		if(this.x == target.x && this.y == target.y) {
			return true;
		} else {
			return false;
		}
		
		
	}

	
	
	
}