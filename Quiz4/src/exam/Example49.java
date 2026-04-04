package exam;

import java.util.Scanner;

public class Example49 {
	
	public static String solution(int q, int r, String code) {
		String answer = "";
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < code.length(); i++) {
			if(i % q == r) {
				result.append(code.charAt(i));
			}
		}
		answer = result.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 >> ");
		int q = sc.nextInt();
		
		System.out.println("정수입력 >> ");
		int r = sc.nextInt();
		sc.nextLine();
		System.out.println("문자열입력 >> ");
		String code = sc.nextLine();
		
		System.out.println(solution(q, r, code));
	}
}
