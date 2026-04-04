package ex06;

public class Example05 {
	public static void main(String[] args) {
		int sum = 0; // 반복문을 돌면서 합을 저장할 변수 
		
		// 1 ~ 10까지의 합
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
