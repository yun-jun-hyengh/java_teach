package ex06;

public class Example11 {
	public static void main(String[] args) {
		/*
		 * for문에서의 무한루프
		 * - 조건식을 생략하면 된다 !! 
		 */
		for(int i = 0; ; i++) {
			System.out.println(i);
			if(i == 10) {
				break;
			}
		}
	}
}
