package student;

public class StudentMain {
	/*
	 * 정적멤버(static) : 고정된이란 의미를 가지고 있음 
	 * - 정적멤버란 필드와 메서드를 선언할 때 static이라는 키워드가 붙은 멤버를
	 * 말함
	 * - static 이라는 키워드를 사용하면 static 변수와 static 메소드를 만들
	 * 수 있고 다른 말로는 정적필드 정적메소드라 하며 이 둘을 합쳐 정적멤버라고 함
	 * - 정적필드와 정적메소드는 클래스에 고정된 멤버!! 
	 * - static 키워드를 통해 생성된 정적멤버들은 Heap 영역이 아닌 
	 * static 영역에 할당된다 !! 
	 * - static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디든지
	 * 참조할 수 있는 장점을 가지지만 가비지 컬렉터의 관리 영역 밖에 있으므로 
	 * 프로그램이 종료시까지 메모리가 할당된 채로 존재한다 !! 
	 */
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.studentName = "김고이";
		stu1.hello();
		// static 멤버는 클래스 명으로 접근하는게 원칙!!
		System.out.println("학교는 " + Student.schoolName + " 입니다");
		Student.goToSchool();
		
		Student stu2 = new Student();
		stu2.studentName = "김고삼";
		stu2.hello();
		System.out.println("학교는 " + Student.schoolName + " 입니다");
		Student.goToSchool();
	}
}
