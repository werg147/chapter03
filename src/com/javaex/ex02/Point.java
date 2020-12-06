package com.javaex.ex02;

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

	//주소값 대용, 변경해서 사용할 수 있다
	/*
	public int hashCode() {
		return 100;
	}
	*/
}