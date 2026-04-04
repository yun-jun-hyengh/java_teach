package exam;

import java.util.Scanner;

public class Example47 {
	
	public static int solution(String myString, String pat) {
		int answer = 0;
		String str1 = myString.toLowerCase();
		String str2 = pat.toLowerCase();
		if(str1.contains(str2)) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String str1 = sc.nextLine();
		System.out.println("문자열 입력 >> ");
		String str2 = sc.nextLine();
		System.out.println(solution(str1, str2));
	}
}
