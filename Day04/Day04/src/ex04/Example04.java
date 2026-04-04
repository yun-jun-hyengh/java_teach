package ex04;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 삼항연산자 
		 * - 피연산자를 3개나 가지는 식 
		 * - 코드를 간격하게 표현할 수 있다 
		 * - 만약 복잡한 조건이 걸릴 시 구현하기 힘듬 
		 * - 많이 사용할 경우 소스코드의 가독성 저하 
		 * - 단순한 조건이 걸린 문제만 삼한연산자로 처리하고 
		 * 그외 복잡한 조건식은 if ~ else문으로 처리하는걸 권장 !! 
		 * 
		 * 형식)
		 * 조건식 ? 피연산자1 : 피연산자2
		 */
		
		boolean result = (10 < 20) ? true : false;
		System.out.println(result);
		
		int num = (7 < 1) ? 1 : 0;
		System.out.println(num);
	}
}
