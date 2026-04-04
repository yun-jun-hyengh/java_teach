package ex08;

public class Example08 {
	public static void main(String[] args) {
		// 배열이 길이가 값의 개수로 결정 
		int arr[] = {80,50,25,11,23,41,800,100};
		
		// 이 배열에서 짝수들만 출력하세요 !! 
		//(80, 50, 800, 100)
		System.out.println(arr.length);
		// 배열의 길이가 값의 개수만큼 루프룰 돌면서 
		// 각 인덱스에 접근하여 짝홀 판단하면 됨 !!
		System.out.println("=======");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}
