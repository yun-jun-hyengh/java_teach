package exam;

import java.util.Scanner;

public class Example27 {
	
	public static int[] solution(int start_num, int end_num) {
		int[] answer = {};
		answer = new int[start_num - end_num + 1];
		int index = 0;
		for(int i = start_num; i >= end_num; i--) {
			answer[index++] = i; 
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int start = sc.nextInt();
		System.out.println("입력 >> ");
		int end = sc.nextInt();
		int[] arr = solution(start, end);
	} 
}
