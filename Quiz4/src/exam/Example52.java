package exam;

import java.util.Scanner;

public class Example52 {
	
	public static int solution(int n) {
		int answer = 0;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
		answer = sum;
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int n = sc.nextInt();
		System.out.println(solution(n));
	}
}
