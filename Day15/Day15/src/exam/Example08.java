package exam;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 / num2);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
}
