package ex04;

public class Example03 {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 20;
		
		int result1 = num1 & num2;
		System.out.println(result1); // 논리합 계산결과
		
		int result2 = num1 | num2;
		System.out.println(result2);
		
		int result3 = num1 ^ num2;
		System.out.println(result3);
		
		// << 연산자
		int result4 = num1 << 1;
		int result5 = num1 << 2;
		System.out.println(result4);
		System.out.println(result5);
		
		// >>
		int result6 = num1 >> 2;
		System.out.println(result6);
		
		// 1의 보수를 취하고(비트반전), 그 다음 2의 보수(+1)을 취한다 !! 
		int num3 = 12;
		int result7 = ~num3;
		System.out.println(result7);
	}
}
