package exam;

import java.util.Scanner;

public class Example17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // 숫자 입력

        int sum = 0;
        while (number > 0) {
            sum += number % 10;     // 마지막 자리 더하기
            number /= 10;           // 마지막 자리 제거
        }

        System.out.println(sum);    // 자릿수 합 출력
	}
}
