package day10;

public class TestClass04 {

	public void sumFunc(int a, int b) {
		// ���� �� ���� ���� ���ϴ� ��� 
		System.out.println("int, int");
		System.out.println(a + b);
	}
	
	public void sumFunc(int a) {
		// �Ű����� ������ �ٸ��� 
		System.out.println("a�� : " + a);
	}
	
	public void sumFunc(int a, double b) {
		// �Ű����� Ÿ���� �ٸ��� ������ 
		// �޼ҵ� ���� �����ص� �ٸ� �޼ҵ�� �ν� 
		System.out.println("int, double");
		System.out.println(a + b);
	}
	
}
