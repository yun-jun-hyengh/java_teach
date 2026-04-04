package exam;

import java.util.Scanner;

public class Example46 {
	
	public static String solution(String phone_number) {
		String answer = "";
		int len = phone_number.length();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < len - 4; i++) {
			sb.append("*");
		}
		sb.append(phone_number.substring(len - 4));
		answer = sb.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("휴대폰 번호 입력 (숫자만): ");
        String phone = sc.nextLine();

        String masked = solution(phone);

        System.out.println("결과: " + masked);
	}
}
