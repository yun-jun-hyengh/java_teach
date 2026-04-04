package exam;

import java.util.Scanner;

public class Example21 {
	
	public static int solution(int a, int b) {
		int answer = 0;
		int temp = 0;
		if((a >= -10000000 && a <= 10000000) && (b >= -10000000 && b <= 10000000)) {
			if(a == b) {
				System.out.println(a);
			}
			if(a > b) {
				temp = a;
				a = b;
				b = temp;
			}
			for(int i = a; i <= b; i++) {
				answer = answer + i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("입력 >> ");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.println(solution(num1, num2));
	}
}
