package exam;

import java.util.Scanner;

public class Example33 {
	
	public static int solution(int[] numbers, int n) {
		int answer = 0;
		for(int i = 0; i < numbers.length; i++) {
			answer = answer + numbers[i];
			if(answer > n) {
				break;
			}
		}
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
		System.out.println("정수입력 >> ");
		int n = sc.nextInt();
		System.out.println(solution(arr, n));
	}
}
