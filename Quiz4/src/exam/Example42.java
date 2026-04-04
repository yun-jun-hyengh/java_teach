package exam;

import java.util.Scanner;

public class Example42 {
	
	public static String solution(String myString) {
		String answer = "";
		StringBuilder result = new StringBuilder();
		for(char c : myString.toCharArray()) {
			if(c == 'a' || c == 'A') {
				result.append('A');
			} else if(Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			} else {
				result.append(c);
			}
		}
		answer = result.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String text = sc.nextLine();
		System.out.println(solution(text));
	}
}
