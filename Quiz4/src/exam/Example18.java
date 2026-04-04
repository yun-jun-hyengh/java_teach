package exam;

import java.util.Scanner;

public class Example18 {
	
	public static int solution(int[] numbers) {
		int answer = -1;
		answer = 0;
		boolean[] check = new boolean[10];
		for(int num : numbers) {
			if(num >= 0 && num <= 9) {
				check[num] = true;
			}
		}
		for(int i = 0; i <= 9; i++) {
			if(!check[i]) {
				answer = answer + i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기 >> ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(arr));
	}
}	
