package exam;

import java.util.Scanner;

public class Example45 {
	
	public static boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int temp = x;
		while(temp > 0) {
			sum = sum + temp % 10;
			temp = temp / 10;
		}
		if(x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		System.out.println(solution(num));
	}
}
