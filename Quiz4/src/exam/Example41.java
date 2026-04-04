package exam;

import java.util.Scanner;

public class Example41 {
	
	public static int solution(String myString, String pat) {
		int answer = 0;
		int index = 0;
		while((index = myString.indexOf(pat, index)) != -1) {
			answer++;
			index += 1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 >> ");
		String text = sc.nextLine();
		
		System.out.println("찾을 문자열 입력 >> ");
		String target = sc.nextLine();
		
		System.out.println(solution(text, target));
	}
}
