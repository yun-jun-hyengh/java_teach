package ex05;

import java.util.Scanner;

public class Example07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >>");
		String s1 = sc.nextLine();
		
		if(s1 == "apple") {
			System.out.println("같음");
		} else if(s1 != "apple") {
			System.out.println("같지않음");
		}
		/*
		 * == : 객체가 같은지를 비교하지만 객체가 갖고 있는 문자열을 비교하지 않음
		 * equals() : 문자열 데이터 값 그 자체를 비교함 
		 */
	}
}
