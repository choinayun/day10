package day10;

import java.util.Scanner;

public class QuizeMain01 {

	public static void main(String[] args) {
		
		// �̸��� �Է¹޾� ����ϴ� ���α׷� ����� 
		// �Է±��, ��±��, ����
		
		// �߰�) 3���� �̸� �Է¹ް� �迭 ��� 
		
		QuizeTest01 t01 = new QuizeTest01();
		
		String n = t01.input();
		
		t01.print(n);
		
		// �߰� 
		String[] str = t01.input02();
		t01.print02(str);
		
		
	}
}

		//����
		// main �޼ҵ忡 ��µ� ���� �Է� 
		// ���������� ����Ǵ��� Ȯ�� 
		// ����� ��� ������ �����ϰ�
		// �ش� ����� �̸��� ���� �޼ҵ�� �ű�� 
		// return �� �����ϰ� ��ȯŸ�� ����
		// main �޼ҵ忡�� �ڷ��� ������ ����










