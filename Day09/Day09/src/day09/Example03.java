package day09;

public class Example03 {
	/*
	 * 클래스(class)
	 * - 일종의 틀, 설계도 이러한 것들을 클래스라고 한다 
	 * - 클래스로부터 만들어진 객체를 인스턴스라 한다 
	 * 
	 * 객체지향 프로그래밍 개발의 단계
	 * 클래스 설계 > 인스턴스와(클래스를 이용한 객체 생성) > 생성된 객체 사용 
	 * 
	 * 객체 간의 관계
	 * - 객체는 개별적으로 사용되기도 하며, 다른 객체와의 관계를 가질 수 있다
	 * 
	 * 집합관계 : 자동차는 엔진, 타이어, 핸들 등으로 구성되므로 자동차와 이 부품들은 집합 관계
	 * 사용관계 : 사람은 자동차를 사용하므로 사람과 자동차는 사용관계
	 * 상속관계 : 기계와 자동차는 상속관계
	 * 
	 * 클래스의 용도
	 * - 라이브러리(API)용 : 다른 클래스에서 사용할 목적으로 설계
	 * - 실행용 : 프로그램의 실행 => main() 메소드를 제공하는 역할을 한다 ! 
	 */
	public static void main(String[] args) {
		Student s1 = new Student(); // Student 클래스의 인스턴스
		Student s2 = new Student(); // Student 클래스의 인스턴스
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
