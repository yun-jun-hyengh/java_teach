package ex06;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지의 짝수들의 합을 구하세요 !!
		 * 답 ) 2550
		 */
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("짝수들의 합 : " + sum);
	}
}
