package ex03;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * 산술연산자
		 * - 산술연산자는 사칙연산자와 나머지 연산자가 있다
		 * - 일반적으로 정수, 실수 등 숫자를 연산할 때 사용 
		 * 
		 * 피연산자의 자료형이 일치하지 않을경우 크기가 큰 
		 * 자료형으로 자동 형 변환이 일어난 후 연산실행
		 * * 연산의 결과값이 자료형의 범위안에 있어야 하고
		 * 만약 범위 밖으로 값이 넘어가면 오버플로우 혹은 
		 * 쓰레기값이 출력 
		 */
		int x = 100;
		int y = 200;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		double num1 = 1.2345;
		int num2 = 6;
		System.out.println(num1 + num2);
		
		//int result = 1000000 * 1000000;
		//System.out.println(result);
		
		long result = 1000000L * 1000000L;
		System.out.println(result);
	}
}
