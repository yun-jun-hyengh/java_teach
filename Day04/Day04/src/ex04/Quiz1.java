package ex04;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 수를 입력받아 짝수인지 홀수인지 
		 * 판단하는 프로그램을 삼항연산자로 작성하세요~~
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		
		int num = sc.nextInt();
		String result = num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		System.out.println("입력받은 숫자는 " + result);
	}
}
