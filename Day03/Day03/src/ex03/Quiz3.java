package ex03;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		int orange = 6350; // 오렌지 개수
		int count = 52; // 한 사람당 나눠줄 오렌지 개수
		int box = orange / count;
		System.out.println("필요한 박스 개수 : " + box);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		int result1 = num / 10;
		int result2 = num % 10;
		System.out.println("십의자리 : " + result1);
		System.out.println("일의자리 : " + result2);
	}
	
}
