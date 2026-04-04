package exam;

class Object1{
	String name;
	String address;
}

public class Example03 {
	/*
	 * 자바 API
	 * - 자바에서 제공하는 API(Application Programming Interface)
	 * 는 프로그램 개발에 자주 사용되는 클래스 및 인터페이스 모음을 말하며
	 * 라이브러리라고도 한다.
	 * 
	 * java.base를 클릭하면 패키지 별로 정리되어 있음
	 * 주로 사용하는 기능들은 java.base에 정의 되어 있다.
	 * 모듈중 유일하게 requires 하지 않아도 사용할 수 있음
	 * java.lang, java.util, java.io 등  
	 * 
	 * java.lang 패키지
	 * - 자바 프로그램의 기본적인 클래스를 담고 있는 패키지 
	 * 
	 * 
	 * Object : 자바 클래스의 최상위 클래스로 사용 
	 * System : 시스템의 표준 입력/출력 장치로부터 데이터를 입력받거나 
	 * 			출력하기 위해 사용 
	 * String : 문자열을 저장하고 여러 가지 정보를 얻을 때 사용
	 * StringBuffer / StringBuilder : 문자열을 저장하고 내부 문자열을
	 * 								  조작할 때 사용 
	 * Math : 수학관련 라이브러리 (반올림, 랜덤..)
	 * 
	 */
	public static void main(String[] args) {
		Object1 obj = new Object1();
		obj.toString();
	}
}
