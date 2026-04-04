package ex07;

public class Example08 {
	public static void main(String[] args) {
		int arr[] = new int[4]; // 4개의 공간을 가진 배열을 선언
		
		// 배열의 값을 넣기 
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
