package ex05;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 중첩(if)
		 * - if문 안에 또다른 if문을 넣을 수 있다 
		 * 
		 * 형식
		 * if(조건) {
		 * 		if(조건){
		 * 			실행문...
		 * 		} else {
		 * 		
		 * 		}
		 * } else {
		 * 
		 * }
		 */
		int score = 86;
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A학점");
			}
		} else if(score >= 80) {
			if(score >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B학점");
			}
		}
	}
}
