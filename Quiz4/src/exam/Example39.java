package exam;

import java.util.Scanner;

public class Example39 {
	
	public static String[] solution(String my_string) {
		String[] answer = {};
		answer = my_string.split(" ");
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String str = sc.nextLine();
		String[] result = solution(str);
		for(String s : result) {
			System.out.print(s + " ");
		}
	}
}
