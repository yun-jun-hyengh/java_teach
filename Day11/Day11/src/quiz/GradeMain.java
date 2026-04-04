package quiz;

import java.util.Scanner;

public class GradeMain {
	/*
	 * Grade 클래스를 작성하세요
	 * 3과목의 점수를 입력받아 Grade 객체를 생성하고 성적과 
	 * 평균을 출력하는 main() 과 실행 예시는 다음과 같다.
	 * 
	 * 수학, 과학, 영어 순으로 3개 점수 입력 >> 90 88 96
	 * 평균은 91
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int mat = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		Grade grade = new Grade(mat, sci, eng);
		System.out.println("평균은 : " + grade.average());
	}
}
