package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeMain02 {
	
	public static void main(String[] args) {
		
		// 두 수를 입력 받아 합을 출력
		// 입력, 출력, 연산, 메인 기능으로 만들기 (배열 활용) 
		// return a,b,c;
		
		QuizeTest02 t = new QuizeTest02();
		
		int[] a = t.input();
		
		int s = t.op(a);
		
		t.print(a[0], a[1], s);
	
		
	}
}
