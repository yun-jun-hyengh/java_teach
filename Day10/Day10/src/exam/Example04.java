package exam;

class MidTerm{
	public int score(int[] score) {
		int result = 0;
		for(int i = 0; i < score.length; i++) {
			result = result + score[i];
		}
		return result;
	}
}

public class Example04 {
	public static void main(String[] args) {
		int[] studentA = {97,53};
		int[] studentB = {95,66};
		
		MidTerm mid = new MidTerm();
		int sum1 = mid.score(studentA);
		int sum2 = mid.score(studentB);
		if(sum1 > sum2) {
			System.out.println("A학생의 중간고사 총점이 더 높다.");
		} else {
			System.out.println("B학생의 중간고사 총점이 더 높다.");
		}
	}
}
