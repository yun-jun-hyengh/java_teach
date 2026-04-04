package student;

public class Student {
	static String schoolName = "코리아 고등학교";
	String studentName;
	
	static void goToSchool() {
		System.out.println("학교에 간다.");
	}
	
	void hello() {
		System.out.println("제 이름은 " + studentName + "입니다.");
	}
}
