package exam;

import java.util.Arrays;

public class Example35 {
	
	public static int[] solution(int arr[]) {
		int[] answer = {};
		if(arr.length == 1) {
			return new int[] {-1};
		}
		int min = Arrays.stream(arr).min().getAsInt();
		
		answer = new int[arr.length - 1];
		int idx = 0;
		for(int num : arr) {
			if(num != min) {
				answer[idx++] = num;
			}
		}
		return answer;
	} 
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1}))); // [4, 3, 2]
        System.out.println(Arrays.toString(solution(new int[]{10})));     
	}
}
