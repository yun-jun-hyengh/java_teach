package ex07;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * 구구단중 짝수단만 출력하세요 !!
		 */
		for(int i = 2; i <= 9; i++) {
			if(i % 2 != 0) { // 2로 나눴을 때 0으로 나눠 떨어지지 않는다면
				continue; // 위로 돌아가라 
			}
			// 2로 나눴을 때 0으로 나눠떨어지면 안쪽 for문 실행 
			for(int j = 1; j <= 9; j++) { 
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}
}
