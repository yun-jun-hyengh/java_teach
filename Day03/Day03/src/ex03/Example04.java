package ex03;

public class Example04 {
	public static void main(String[] args) {
		/*
		 * 부호 연산자
		 * +를 적용할 경우에는 부호를 유지.
		 * -를 적용할 경우에는 부호를 변경 
		 * 부호연산자를 적용한 변수는 int 타입이 되므로
		 * short 타입에 저장할 경우 컴파일 에러가 발생 !!
		 * 부호 연산자로 리터럴의 부호를 변경할 때 부호 정보 
		 * 변경은 int 타입으로 처리된다 !!
		 */
		int a = -10;
		int result1 = +a;
		int result2 = -a;
		System.out.println(result1);
		System.out.println(result2);
	}
}
