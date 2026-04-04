package ex07;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 배열을 생성하기 위해서는 new와 함께 자료형과 길이를 지정한다
		 * 
		 * 형식)
		 * int[] arr = new int[크기];
		 * 
		 */
		int arr1[] = new int[4];
		int arr2[] = {1,2,3,4,5};
		
		//System.out.println(arr1);
		//System.out.println(arr2);
		for(int i = 0; i < arr2.length; i++) {
			// 배열의 길이는 배열 객체의 length 필드를 이용해서 사용할 수 있다.
			System.out.println(arr2[i]);
		}
	}
}
