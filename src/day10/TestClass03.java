package day10;

public class TestClass03 {
	 
	public int sumFunc(int num1, int num2) {
				
		int sum = num1 + num2;
		return sum;
		// 메소드의 반환타입만 맞춰주기 
	}
	
	public String test() {
		
		System.out.println("test 호출");
		return "12345"; 
		// return : 특정 값을 돌려주는 역할 + 메소드 종료 
		// return 값을 주게되면 반환타입을 해당값의 자료형으로 변경해줘야함 
		
	}
	
}
