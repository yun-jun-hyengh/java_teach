package day09;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 숫자 한개를 입력받아 입력받은 수만큼 
		 * 배열크기를 지정하여 
		 * 3의 배수를 저장하는 배열을 만들고 출력하세요 !!
		 * 
		 * 출력 예)
		 * 5를 입력받으면
		 * 3	6	9	12	15	
		 * 
		 * 9를 입력받으면
		 * 3	6	9	12	15	18	21	24	27
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			int sub = i + 1; // 배열은 0번방 부터 시작하므로 0 x 3 = 0이니까 
			// + 1을 하여 계산
			arr[i] = 3 * sub;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
}
