package ex02;

public class Example11 {
	public static void main(String[] args) {
		/*
		 * 메모리에 할당받은 크기가 큰 자료형을 크기가 작은 자료형으로
		 * 변환하면 데이터의 손실이 발생
		 * 
		 * 크기가 작은 자료형에서 큰 자료형으로 변환할 때는 데이터 손실이 없어
		 * 형 변환을 생략할 수 있다 
		 */
		
		int i1 = 10;
		byte b1 = (byte) i1;
		System.out.println(b1);
		
		byte b2 = 127;
		int i2 = b2;
		System.out.println(i2);
		
		
	}
}
