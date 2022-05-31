package day10;

public class TestClass04 {

	public void sumFunc(int a, int b) {
		// 정수 두 개의 합을 구하는 기능 
		System.out.println("int, int");
		System.out.println(a + b);
	}
	
	public void sumFunc(int a) {
		// 매개변수 갯수가 다를때 
		System.out.println("a값 : " + a);
	}
	
	public void sumFunc(int a, double b) {
		// 매개변수 타입이 다르기 때문에 
		// 메소드 명이 동일해도 다른 메소드로 인식 
		System.out.println("int, double");
		System.out.println(a + b);
	}
	
}
