package ex02;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * 기본 자료형
		 * - 실제 데이터 값을 저장한다.
		 * - 정수, 실수, 논리 타입으로 분류된 8개의 자료형이 있고
		 * 각각 저장 크기가 다르며 기본값이 정해져있음
		 * - 정수형, 실수형, 논리형
		 * 
		 * 
		 * 참조 자료형
		 * - 데이터가 저장되어 있는 메모리 번지를 저장!!
		 * - 배열형, 열거형, 클래스, 인터페이스  
		 * 
		 * Stack 영역과 Heap 영역 
		 * 
		 * Stack 영역
		 * - 기본자료형(int, double, byte, long, boolean) 등 해당하는 
		 * 지역변수의 값이 저장되는 공간 
		 * - Heap 영역에 생성된 Object 타입의 데이터 참조값이 할당된다.
		 * 참조값이란?
		 * - 객체의 메모리를 생성했을 때 메모리와 연결된 유일한 숫자값(주소값) 
		 * 
		 * 
		 * Heap 영역
		 * - 객체와 배열이 생성되는 영역
		 * - 참조하는 변수나 필드가 없다면 의미없는 객체로 이를 쓰레기 값으로 취급
		 * - JVM은 이러한 것들을 가비지 컬렉터를 실행시켜 자동으로 객체를 제거 
		 */
		int age = 30;
		double height = 170.5; 
		String name = "윤준형";
		String job = "코리아IT아카데미 JAVA 강사";
		
		System.out.println(age);
		System.out.println(height);
		System.out.println(name);
		System.out.println(job);
		
		String name1 = new String("윤준형");
		System.out.println(name1);
	}
}
