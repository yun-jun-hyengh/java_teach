package ex03;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 국어점수 85점
		 * 수학점수 85점
		 * 영어점수 75점
		 * 국사점수 88점
		 * 네 과목의 합계(정수)와 평균(실수)를 출력하세요!!
		 */
		int kor = 85;
		int mat = 85;
		int eng = 75;
		int his = 88;
		
		// 합계
		int sum = kor + mat + eng + his;
		// 평균
		double avg = sum / (double)4;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
