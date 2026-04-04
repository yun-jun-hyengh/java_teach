package exam;

import java.util.Scanner;

public class Example24 {
	
	public static String solution(String my_string, int n) {
		String answer = "";
		String result = my_string.substring(0, n);
		answer = result;
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String str = sc.nextLine();
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		System.out.println(solution(str, num));
	}
}
