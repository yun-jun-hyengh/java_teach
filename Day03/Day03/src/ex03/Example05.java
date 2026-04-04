package ex03;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 증감연산자(++, --)
		 * 형식) 
		 * int a = 10;
		 * a++ or ++a
		 * 
		 * - 변수의 값을 1증가시키거나, 1감소시킨다
		 * - 변수명 앞에 증감연산자가 있을 경우 전위증감
		 *   변수명 뒤에 증감연산자가 있을 경우 후위증감
		 * 
		 * 전위증감 : 그 라인에서 변수를 1증가 또는 감소
		 * 후위증감 : 다음 라인에서 변수를 1증가 또는 감소 
		 */
		int a = 10;
		int b = 10;
		System.out.println("a = " + ++a);
		System.out.println("b = " + b++);
		System.out.println("a = " + a + ", b = " + b);
		
		int n1 = 1;
		int n2 = 1;
		int result1 = --n1;
		int result2 = n2--;
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
