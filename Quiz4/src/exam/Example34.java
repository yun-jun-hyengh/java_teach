package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Example34 {
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int count = 0;
		for(int value : arr) {
			if(value % divisor == 0) {
				count++;
			}
		}
		if(count == 0) {
			return new int[] {-1};
		}
		answer = new int[count];
		int idx = 0;
		for(int val : arr) {
			if(val % divisor == 0) {
				answer[idx++] = val;
			}
		}
		Arrays.sort(answer);
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열크기입력 >> ");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println("나누는 수 >> ");
		int div = sc.nextInt();
		int[] output = solution(arr, div);
		for(int s : output) {
			System.out.println(s);
		}
	}
}
