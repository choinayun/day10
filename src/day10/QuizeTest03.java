package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeTest03 {

	// 입력 
	public ArrayList input() {
		
		ArrayList arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int num1,num2 ;
		
		System.out.println("숫자 입력");
		num1 = sc.nextInt();
		arr.add(num1);
	
		System.out.println("숫자 입력");
		num2 = sc.nextInt();
		arr.add(num2);
		
		return arr;
	}
	
	// 연산
	public int op(ArrayList arr) {
		
		int sum = (int)arr.get(0) + (int)arr.get(1); // 형 변환 
		return sum;
	}
	
	// 출력 
	public void print(ArrayList arr, int sum) {
		System.out.println(arr.get(0) + "+" + arr.get(1) + "=" + sum);
	}
	
}
