package ex04;

public class Example12 {
	public static void main(String[] args) {
		// 두 과목의 평균 점수를 산출해 70점 이상이면 합격
		// 70점 미만이거나 한 과목이 50점 미만이면 불합격으로 
		// 처리하는 프로그램
		
		int kor = 40, eng = 20;
		double avg = (kor + eng) / 2.0;
		
		if(kor < 50 || eng < 50) {
			System.out.println("한 과목이 50점 미만이므로");
			System.out.println("불합격(과락)입니다.");
		} else if(avg >= 70) {
			System.out.println("두 과목의 평균 점수가 70점 이상이므로");
			System.out.println("합격입니다.");
		} else {
			System.out.println("두 과목의 평균 점수가 70점 미만이므로");
			System.out.println("불합격입니다.");
		}
	}
}
