package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Example28 {
	
	public static int[] solution(int n, int k) {
		int[] answer = {};
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(i % k == 0) {
				count++;
			}
		}
		answer = new int[count];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = (i + 1) * k; 
		}
		return answer;
	}
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int n = sc.nextInt();
		System.out.println("입력 >> ");
		int k = sc.nextInt();
		int[] arr = solution(n, k);
		System.out.println(Arrays.toString(arr));
		
		//System.out.println("count : " + count);
	}
}
