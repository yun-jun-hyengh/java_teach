package ex05;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이입력 >> ");
		int age = sc.nextInt();
		
		if(age > 19) {
			System.out.println("성인입니다.");
		} else if(age > 13) {
			System.out.println("급식입니다.");
		} else if(age > 6) {
			System.out.println("잼민입니다.");
		} else {
			System.out.println("아기입니다.");
		}
	}
}
