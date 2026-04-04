package exam;

import java.util.Scanner;

public class Example25 {
	
	public static String solution(String my_string, int s, int e) {
		String answer = "";
		String prefix = my_string.substring(0, s);
		String target = my_string.substring(s, e + 1);
		String suffix = my_string.substring(e + 1);
		String reversed = new StringBuilder(target).reverse().toString();
		answer = prefix + reversed + suffix;
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String str = sc.nextLine();
		System.out.println("시작 인덱스 >> ");
		int num1 = sc.nextInt();
		System.out.println("끝 인덱스 >> ");
		int num2 = sc.nextInt();
		System.out.println(solution(str, num1, num2));
	}
}
