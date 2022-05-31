package day10;

import java.util.Scanner;

public class QuizeMain01 {

	public static void main(String[] args) {
		
		// 이름을 입력받아 출력하는 프로그램 만들기 
		// 입력기능, 출력기능, 메인
		
		// 추가) 3명의 이름 입력받고 배열 사용 
		
		QuizeTest01 t01 = new QuizeTest01();
		
		String n = t01.input();
		
		t01.print(n);
		
		// 추가 
		String[] str = t01.input02();
		t01.print02(str);
		
		
	}
}

		//순서
		// main 메소드에 출력될 내용 입력 
		// 정상적으로 실행되는지 확인 
		// 기능을 어떻게 나눌지 생각하고
		// 해당 기능의 이름을 가진 메소드로 옮기기 
		// return 값 설정하고 반환타입 변경
		// main 메소드에서 자료형 변수값 선언










