package day10;

import java.util.Scanner;

public class QuizeTest02 {

	
	// �Է�
	public int[] input() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[2];
		
		System.out.println("���� �Է�");
		numArr[0] = sc.nextInt();
		System.out.println("���� �Է�");
		numArr[1] = sc.nextInt();
	
		return numArr;
	}
	
	// ����
	public int op(int[] a) {
		
		return a[0] + a[1];
	}
	
	// ���
	public void print(int a, int b, int c) {
		
		System.out.println(a + "+" + b + "=" + c);
	}

}
