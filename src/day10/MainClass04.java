package day10;

// �����ε�

// ������ �̸��� �޼ҵ带 ����� ��
// �̸��� ���� �޼ҵ带 �����ϱ� ���ؼ��� �Ű������� ���� 
// �Ű������� ���� �Ǵ� Ÿ���� ���� �ٸ��� �ٸ� �޼ҵ�� �ν�

public class MainClass04 {

	public static void main(String[] args) {
		
		TestClass04 t = new TestClass04();
		
		t.sumFunc(10, 20);
		t.sumFunc(10, 20.5);
		t.sumFunc(120);
		
		
		// Math.random 
		// ���ÿ� ���� �����ؾ��� *���� (������ ����)
		for(int i = 0; i < 5; i++) {
			int ran = (int)(Math.random()*3) + 10;
			System.out.println( ran );
			
		}
		
		
	}
	
}