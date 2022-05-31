package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeMain03 {

	public static void main(String[] args) {
	
		// 두 수를 입력 받아 합을 출력
		// 입력, 출력, 연산, 메인 기능으로 만들기 (배열 활용) 
		
		// 추가) ArrayList 로 변환하기 
		
		QuizeTest03 t = new QuizeTest03();
		
		ArrayList arr = t.input();
		
		int sum = t.op(arr);
		
		t.print(arr, sum);
	}
}
