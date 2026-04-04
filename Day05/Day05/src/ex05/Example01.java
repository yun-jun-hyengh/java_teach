package ex05;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		int result = 0;
		
		if(3 > 2) {
			result = 3;
		}
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		if(age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
	}
}
