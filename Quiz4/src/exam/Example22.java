package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Example22 {
	
	public static int[] solution(int[] num_list, int n) {
		int[] answer = {};
		int startIndex = n - 1;
		answer = Arrays.copyOfRange(num_list, startIndex, num_list.length);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int n = sc.nextInt();
		int arr[] = new int[num];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextInt();
		}
		int[] result = solution(arr, n);
		System.out.println(Arrays.toString(result));
	}
}
