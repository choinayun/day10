package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeMain02 {
	
	public static void main(String[] args) {
		
		// �� ���� �Է� �޾� ���� ���
		// �Է�, ���, ����, ���� ������� ����� (�迭 Ȱ��) 
		// return a,b,c;
		
		QuizeTest02 t = new QuizeTest02();
		
		int[] a = t.input();
		
		int s = t.op(a);
		
		t.print(a[0], a[1], s);
	
		
	}
}
