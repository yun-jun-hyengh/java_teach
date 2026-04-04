package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example30 {
	
	public static int[] solution(int[] num_list, int n) {
		int[] answer = {};
		List<Integer> resultList = new ArrayList<>();
		for(int i = 0; i < num_list.length; i = i + n) {
			resultList.add(num_list[i]);
		}
		answer = new int[(num_list.length + n - 1) / n];
		for(int i = 0; i < resultList.size(); i++) {
			answer[i] = resultList.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기 입력 >> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("간격 >> ");
		int gap = sc.nextInt();
		int[] result = solution(arr, gap);
		System.out.println(Arrays.toString(result));
	}
}
