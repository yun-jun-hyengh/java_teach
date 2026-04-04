package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Example54 {
	
	public static int solution(int[] nums) {
		int answer = 0;
		int a = nums.length / 2;
		answer = Math.min(a, (int) Arrays.stream(nums).distinct().count());
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기입력 >> ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
	}
}
