package exam;

public class Example07 {
	public static void main(String[] args) {
		/*
		 * charAt() : charAt()은 문자열에서 문자 하나를 추출할 수 있는
		 * 메소드 
		 */
		String str = "abcde";
		System.out.println("str문자열 0번째 인덱스 : " + str.charAt(0));
		System.out.println("str문자열 1번째 인덱스 : " + str.charAt(1));
		System.out.println("str문자열 2번째 인덱스 : " + str.charAt(2));
		System.out.println("str문자열 3번째 인덱스 : " + str.charAt(3));
		System.out.println("str문자열 4번째 인덱스 : " + str.charAt(4));
	
		String str1 = "Hello World";
		System.out.println("str1의 5번째 인덱스 : " + str1.charAt(5));
		
		// length() : 문자열의 길이를 반환
		System.out.println(str1.length());
	}
}
