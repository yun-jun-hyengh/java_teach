package exam;

import java.util.Scanner;

public class Example16 {
	
	public static double solution(int[] arr) {
		int sum = 0;
		double answer = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		answer = (double) sum / arr.length;
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기 >> ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
	}
}
