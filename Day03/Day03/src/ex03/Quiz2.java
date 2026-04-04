package ex03;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 자신의 나이, 이름, 학교, 거주지를 입력받아
		 * 출력하는 프로그램을 작성하세요
		 * 
출력결과)
저의 나이는 24 살이고, 이름은 윤준형, 학교는 코리아대학 이며, 
부산시 수영구 광안동에 살고 있습니다

출력결과는 콘솔창에 한줄로 출력하도록 하세요!! 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 >> ");
		int age = sc.nextInt();
		System.out.println("이름 >> ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("학교 >> ");
		String sch = sc.nextLine();
		System.out.println("거주지 >> ");
		String addr = sc.nextLine();
		System.out.printf("저의 나이는 %d살이고, 이름은 %s, 학교는 %s, %s 에 살고 있습니다.",age,name,sch,addr);
	}
}
