package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeTest03 {

	// �Է� 
	public ArrayList input() {
		
		ArrayList arr = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int num1,num2 ;
		
		System.out.println("���� �Է�");
		num1 = sc.nextInt();
		arr.add(num1);
	
		System.out.println("���� �Է�");
		num2 = sc.nextInt();
		arr.add(num2);
		
		return arr;
	}
	
	// ����
	public int op(ArrayList arr) {
		
		int sum = (int)arr.get(0) + (int)arr.get(1); // �� ��ȯ 
		return sum;
	}
	
	// ��� 
	public void print(ArrayList arr, int sum) {
		System.out.println(arr.get(0) + "+" + arr.get(1) + "=" + sum);
	}
	
}
