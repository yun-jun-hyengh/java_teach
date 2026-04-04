package exam;

public class Example01 {
	/*
	 * throws - 예외 던지기
	 * - 메소드 내부에서 예외가 발생할 수 있는 것을 대비하여 try-catch
	 * 블록으로 예외를 처리한다 
	 * 그러나 경우에 따라서는 throws 키워드를 사용해 메소드를 호출한 곳으로
	 * 예외를 떠넘길 수 있다.
	 */
	
	public static void main(String[] args) {
		try {
			findClass(); // findClass() 메소드를 try 블록 내에서 실행
		} catch(ClassNotFoundException e) {
			System.out.println("존재하지 않는 클래스 입니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cla = Class.forName("Java.lang.string");
		findClass(); // 내부의 코드에서 예외가 발생하면 그 예외를 호출한
					// 곳으로 떠넘김 
	}
}
