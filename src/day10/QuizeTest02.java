package day10;

import java.util.Scanner;

public class QuizeTest02 {

	
	// 입력
	public int[] input() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[2];
		
		System.out.println("숫자 입력");
		numArr[0] = sc.nextInt();
		System.out.println("숫자 입력");
		numArr[1] = sc.nextInt();
	
		return numArr;
	}
	
	// 연산
	public int op(int[] a) {
		
		return a[0] + a[1];
	}
	
	// 출력
	public void print(int a, int b, int c) {
		
		System.out.println(a + "+" + b + "=" + c);
	}

}
