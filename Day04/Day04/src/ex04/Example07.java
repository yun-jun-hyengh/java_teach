package ex04;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 조건문(if)
		 * - 조건식의 결과에 따라 종속 문장(블록 내의 문장)의 실행
		 * 여부가 결졍
		 * - 조건식의 연산 결과가 true이면 블록 내 문장을 실행하고 
		 * false면 실행하지 않는다 
		 * - if문의 조건식에는 boolean 변수 또는 true 와 false 값을
		 * 산출할 수 있는 연산식이 올 수 있음
		 * - else문은 단독으로 사용불가 
		 * - if문의 실행문이 실행될 경우 if ~ else 문을 바로 벗어남 !!
		 * 
		 * 형식)
		 * if(조건식) {
		 * 		실행문...
		 * } else {
		 * 		실행문...
		 * }
		 */
		
		int score = 70;
		if(score >= 60) {
			System.out.println("합격입니다!!");
		} else {
			System.out.println("불합격입니다!!");
		}
		
		/*if(score >= 60)
			System.out.println("합격입니다!!");
		else
			System.out.println("불합격입니다!!");*/
	}
}
