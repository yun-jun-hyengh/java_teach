package ex06;

public class Example16 {
	public static void main(String[] args) {
		/*
		 * do ~ while문
		 * - 먼저 루프를 실행하고 조건식을 검사
		 * 즉) 조건과 상관없이 무조건 루프 한번은 실행함
		 */
		
		int sum = 0;
		int i = 1;
		
		do {
			sum = sum + i;
			i++;
		} while(i <= 10);
		
		System.out.println("합계 : " + sum);
	}
}
