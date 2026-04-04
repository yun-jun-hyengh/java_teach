package ex06;

public class Example15 {
	public static void main(String[] args) {
		/*
		 * continue문
		 * - 반복문 안에서 continue문을 만나면 이후의 실행 코드는 
		 * 수행되지 않고 반복문의 처음으로 돌아가 반복문을 실행한다 !! 
		 */
		
		// 1 ~ 100까지의 홀수 구하기
		int i = 0;
		while(i <= 100) {
			i++;
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
