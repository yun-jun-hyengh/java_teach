package exam;

import java.util.Scanner;

public class Example29 {
	
	public static int solution(int[] num_list) {
		int answer = 0;
		int oddSum = 0;
		int evenSum = 0;
		for(int i = 0; i < num_list.length; i++) {
			if((i + 1) % 2 == 1) {
				oddSum = oddSum + num_list[i];
			} else {
				evenSum = evenSum + num_list[i];
			}
		}
		int result = Math.max(oddSum, evenSum);
		answer = result;
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 길이 입력 >> ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
	}
}
