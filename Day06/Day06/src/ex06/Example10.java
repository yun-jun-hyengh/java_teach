package ex06;

public class Example10 {
	public static void main(String[] args) {
		/*
		 * 무한루프
		 * - 말 그대로 무한히 반복됨 !!
		 * - 이 루프는 특정 조건을 걸지 않을 시 지구멸망해도 계속 돌아감 
		 */
		int i = 0;
		while(true) {
			if(i == 10) {
				break;
			}
			i++;
			System.out.println(i);
		}
		
		/*
		 * while문과 for문
		 * 
		 * for문
		 * - 구하고자 하는 값의 조건이 무엇인지 명확할 경우 사용하는것이 좋음
		 * - 또한 초기값 조건식 증감식이 while문과 달리 블록에서 바로 찾을 수 있어서 
		 * 가독성이 좋음 
		 * 
		 * while문
		 * - 구하고자 하는 값의 조건이 정확하게 모를 경우, 즉 유동적인 경우에 사용하면
		 * 좋다 
		 * - 조건식이 한곳에 있지 않아 가독성이 나쁘다 
		 * 
		 */
	}
}
