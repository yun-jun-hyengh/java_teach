package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example20 {
	
	public static int[] solution(int[] num_list, int n) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		
		for(int i = n; i < num_list.length; i++) {
			list.add(num_list[i]);
		}
		
		for(int i = 0; i < n; i++) {
			list.add(num_list[i]);
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("크기입력 >> ");
		int num = sc.nextInt();
		System.out.println("배열 인덱스 선정 >> ");
		int index = sc.nextInt();
		int arr[] = new int[num];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextInt();
		}
		int a[] = solution(arr, index);
		System.out.println(Arrays.toString(a));
	}
}
