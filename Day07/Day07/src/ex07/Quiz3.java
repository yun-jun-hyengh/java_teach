package ex07;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		int max = 0; // 약수들 중 가장 큰수 
		int temp = 0;
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for(int i = 1; i <= num2 || i <= max; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println("공악수 : " + i);
				if(max < i) {
					max = i;
				}
			}
		}
		System.out.println("최대공약수 : " + max);
	}
}
