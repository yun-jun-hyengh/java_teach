package ex08;

public class Example02 {
	public static void main(String[] args) {
		int arr[] = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		System.out.println(arr[0]); // 0번 인덱스에 저장된 값이 출력됨
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		// 해당 배열의 길이를 알고싶을 때 
		System.out.println("arr 배열의 길이 : " + arr.length);
	}
}
