package day10;

import java.util.Scanner;

public class QuizeTest01 {
		
	public String input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� �Է�");
		String name = sc.next();
		
		return name;
	}
	
	public void print(String n) {
		
		System.out.println("�̸� ���" + n);
	}
	
	
	
	// �߰�
	
	public String[] input02() {

		Scanner input = new Scanner(System.in);
		String[] nameArr = new String[3];
		
		for(int i = 0; i < nameArr.length; i++) {
			System.out.println(i + ". �̸� �Է�");
			nameArr[i] = input.next();
			
		}
		return nameArr;
		
	}
	
	public void print02(String[] nameArr) {
		
		System.out.println("===�̸� ���===");
		for(int i = 0; i < nameArr.length; i++) {
			System.out.println(i + "." + nameArr[i]);
		}
		
	}
		
}
