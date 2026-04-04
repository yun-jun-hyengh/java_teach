package ex04;

public class Example14 {
	public static void main(String[] args) {
		/*
		 * equals()
		 * - 두 개의 문자열이 동일한지 동일하지 않은지 판단!!
		 * - 모든 객체의 부모 클래스인 Object에 정의되어있는 메소드 
		 */
		String str1 = "Hello";
		String str2 = "World";
		String str3 = "Hello";
		
		if(str1.equals(str2)) {
			System.out.println("같습니다");
		} else if(str1.equals(str3)) {
			//System.out.println("다릅니다");
			System.out.println("str1문자열과 str2문자열이 같습니다");
		} 
		
	}
}
