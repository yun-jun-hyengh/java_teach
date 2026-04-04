package exam;

import java.util.Scanner;

public class Example43 {
	
	public static String solution(String my_string, String alp) {
		String answer = "";
		StringBuilder result = new StringBuilder();
		int i = 0;
		while(i < my_string.length()) {
			if(i <= my_string.length() - alp.length() && 
			    my_string.substring(i, i + alp.length()).equals(alp)) {
			    result.append(alp.toUpperCase());
			    i += alp.length();
			} else {
				result.append(my_string.charAt(i));
				i++;
			}
		}
		answer = result.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String text =sc.nextLine();
		System.out.println("바꿀 문자열 입력 >> ");
		String target = sc.nextLine();
		System.out.println(solution(text, target));
	}
}
