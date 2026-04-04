package phone;

public interface Phone {
	final int TIMEOUT = 10000; // 상수필드 선언
	void sendCall(); // 추상메소드 (public abstract 생략가능하다) 
	void receiveCall();
	/*
	 * Default Method
	 * - 인터페이스는 기능에 대한 선언만 가능하다. 그러므로 실제 코드를 구현한 로직은
	 * 포함될 수 없는데. 자바8에서 이러한 룰을 깨뜨리는 기능이 나옴 
	 * - 메소드 선언시 default를 명시하게 되면 인터페이스 내부에서도 로직이 포함된 
	 * 메소드를 선언할 수 있다. 
	 */
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
