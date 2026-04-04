package exam;

import java.util.Scanner;

public class Example05 {
	
	public static String solution(String my_string, int n) {
		String answer = "";
		answer = my_string.substring(my_string.length() - n);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열입력 >> ");
		String my_string = sc.nextLine();
		System.out.println("숫자입력 >> ");
		int n = sc.nextInt();
		
		System.out.println(solution(my_string, n));
	}
}
