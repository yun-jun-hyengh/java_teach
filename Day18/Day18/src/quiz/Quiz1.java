package quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 파파 파스타 가게는 점심 추천 파스타와 생과일 주스 세트 메뉴가 인기가 좋다 
		 * 이 세트 메뉴를 주문하면 그 날의 3종류의 파스타와 2종류의 생과일 주스에서 하나씩 
		 * 선택한다. 파스타와 생과일 주스의 가격 합계에서 10%를 더한 금액이 대금된다 
		 * 어느 날의 파스타와 생과일 주스의 가격이 주어졌을 때 그 날의 세트 메뉴의 대금의 
		 * 최소값을 구하는 프로그램을 작성하세요 
		 * 
		 * 입력)
		 * 입력은 5 행으로 이루어지며, 한 줄에 하나씩 양의 정수가 적혀있다.
		   1행의 정수는 첫 번째 파스타 가격이다.
		   2행의 정수는 두 번째 파스타 가격이다.	
		   3행의 정수는 세 번째 파스타 가격이다.
		   4행의 정수는 첫 번째 생과일 쥬스 가격이다.
		   5행의 정수는 두 번째 생과일 쥬스의 가격이다.
		   (모든 파스타와 생과일 쥬스의 가격은 100 원이상 2000원 이하이다.)
		   
		   출력)
		   그날 세트 메뉴의 최소 대금을 소수 첫째자리까지 출력하시오.
		   
		   실행결과)
		   입력 800 700 900 198 330
		   출력 987.8
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int arr1[] = new int[3];
		int arr2[] = new int[2];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int min1 = arr1[0];
		int min2 = arr2[0];
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] < min1) {
				min1 = arr1[i];
			}
		}
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] < min2) {
				min2 = arr2[i];
			}
		}
//		System.out.println("min1 : " + min1);
//		System.out.println("min2 : " + min2);
		DecimalFormat df = new DecimalFormat("#,###.0");
		double total = (min1 + min2) * 1.1;
		String formatted = df.format(total);
		System.out.println(formatted);
	}
}
