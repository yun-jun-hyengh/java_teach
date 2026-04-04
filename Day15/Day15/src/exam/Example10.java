package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			
		
			System.out.println("점수를 입력하세요 >> ");
			int score = sc.nextInt();
			if(score >= 65) {
				System.out.println("합격입니다.");
			} else {
				System.out.println("불합격입니다.");
			}
		} catch(InputMismatchException e) {
			System.out.println("키보드 입력이 잘못 되었습니다.");
		}
	}
}
