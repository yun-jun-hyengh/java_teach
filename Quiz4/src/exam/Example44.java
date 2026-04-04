package exam;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Example44 {
	
	public static int[] solution(int[] arr) {
		int[] answer = {};
		if (arr.length == 0) return new int[0];
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i - 1]) {
				list.add(arr[i]);
			}
		}
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 입력: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("배열 원소 입력:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = solution(arr);

        System.out.print("중복 제거 결과: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

	}
}
