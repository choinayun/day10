package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizeMain03 {

	public static void main(String[] args) {
	
		// �� ���� �Է� �޾� ���� ���
		// �Է�, ���, ����, ���� ������� ����� (�迭 Ȱ��) 
		
		// �߰�) ArrayList �� ��ȯ�ϱ� 
		
		QuizeTest03 t = new QuizeTest03();
		
		ArrayList arr = t.input();
		
		int sum = t.op(arr);
		
		t.print(arr, sum);
	}
}
