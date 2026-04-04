package ex02;

public class Example08 {
	public static void main(String[] args) {
		/*
		 * boolean
		 * - true, false 값을 저장 
		 */
		boolean isStudent = true;
		System.out.println(isStudent);
		
		if(isStudent) {
			System.out.println("학생입니다.");
		} else {
			System.out.println("학생이 아닙니다.");
		}
		
		boolean flag = false;
		if(flag) {
			System.out.println("종료!!");
		} else {
			System.out.println("실행!!");
		}
	}
}
