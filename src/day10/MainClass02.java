package day10;

import java.util.Scanner;

public class MainClass02 {

	public static void main(String[] args) {
		
		TestClass02 t01 = new TestClass02();
		
		int n = 1000;
		
		t01.test(1000, "안녕하세요");
		
		// 값을 넣어서 출력할 경우 
		// 그 값을 넣어주기위한 변수를 메소드()괄호 안에 
		// 자료형과 그 이름으로 꼭 넣어줘야한다
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2 ;
			
		System.out.println("수 입력");
		num1 = input.nextInt();
		System.out.println("수 입력");
		num2 = input.nextInt();
		
		t01.sumFunc(num1, num2);
		// 매개변수 파라미터 
		
	}
}
