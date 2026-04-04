package ex06;

public class Example12 {
	public static void main(String[] args) {
		/*
		 * 초기식과 증감식이 둘 이상일 경우에는 쉼표로 구분하여 사용
		 */
		for(int i = 0, j = 10; i <= 5 && j >= 5; i++, j--) {
			System.out.println(i + " " + j);
		}
	}
}
