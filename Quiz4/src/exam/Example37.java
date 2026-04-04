package exam;

import java.util.Scanner;

public class Example37 {
	
	public static String solution(String s) {
		String answer = "";
		int len = s.length();
		int half = len / 2;
		if(len % 2 == 0) {
			answer = s.substring(half - 1, half + 1);
		} else {
			answer = s.substring(half, half + 1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String str = sc.nextLine();
		System.out.println(solution(str));
	}
}
