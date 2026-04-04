package ex06;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * for문
		 * 
		 * 형식)
		 * for(초기식; 조건식; 증감식;){
		 * 		실행문장...
		 * }
		 * 1. 초기식 실행
		 * 2. 조건식 실행 
		 * 3. 실행문장 실행 
		 * 4. 증감식 실행
		 * 5. 증감식 실행 후 조건식에 부합한지 판별 
		 * 6. 실행문 수행
		 * 7. 증감식 실행 후 조건식에 부합한지 판별
		 * 8. 조건식에 부합하지 않으면 반복문 종료 !! 
		 */
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("====================");
		for(int i = 0; i <= 100; i++) {
			System.out.println("Hello world");
		}
	}
}
