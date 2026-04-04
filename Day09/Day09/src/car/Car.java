package car;

public class Car {
	int wheel = 4;
	
	/*
	 * 생성자(Constructor)
	 * - new 클래스명()
	 * - 직접 선언하지 않아도 기본 생성자가 자동으로 생성된다.
	 * - 생성자를 통해 객체 변수를 초기화한다는 것은, 단순히 어떠한 값을 초기화한다는 
	 * 뜻이 아닌 필드와 메서드를 호출하는 등 객체를 사용하기 위해서는 객체 변수가 
	 * 메모리에 올라가야 하는데. 이렇게 메모리에 객체 변수를 올려주는 역할을 생성자가 하고 있음
	 */
	public Car() {
		
	}
	
	/*
	 * 메소드
	 * - 리턴값이 없는 경우 void
	 * - 리턴값이 있을 경우 해당 자료형을 반환 
	 * 형식)
	 * void print(){			 
	 * 								
	 * 		코드
	 * }
	 * 
	 * int a(){
	 * 		코드
	 * 		return 변수;
	 * }
	 */
	void ride() {
		System.out.println("달린다.");
	}
	void stop() {
		System.out.println("멈춘다.");
	}
}
