package day09;

public class Example02 {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		
		// 변수를 선언한 뒤 그 변수에 배열의 값이 저장되어 반복하게 됨 
		// 배열의 길이만큼 코드가 반복된다 
		for(int i : array) { // 일반 for문과 다르게 반복에 배열을 이용해야 함 
			System.out.print(i + " ");
		}
	}
}
