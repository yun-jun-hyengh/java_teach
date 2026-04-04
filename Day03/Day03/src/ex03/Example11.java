package ex03;

public class Example11 {
	public static void main(String[] args) {
		/*
		 * 관계연산자(<, <=, >, >=, ==, !=)
		 * - 2개의 피연산자를 부호로 비교하여 그 부호 관계가
		 * true인지 false인지 판별하는 연산자 
		 */
		int a = 10;
		int b = 20;
		
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		char ch1 = 'A'; // int 타입으로 변환되어 연산을 수행
		int num1 = 65;
		System.out.println(ch1 == num1);
	}
}
