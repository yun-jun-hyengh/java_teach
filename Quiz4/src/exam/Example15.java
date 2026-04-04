package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Example15 {
	
	public static int[] solution(int l, int r) {
		int[] answer = {};
		List<Integer> tempList = new ArrayList<>();
		Queue<String> queue = new LinkedList<>();
		queue.add("5");
		while(!queue.isEmpty()) {
			String current = queue.poll();
			int number = Integer.parseInt(current);
			if(number > r) {
				continue;
			} 
			if(number >= l) {
				tempList.add(number);
			}
			
			queue.add(current + "0");
			queue.add(current + "5");
		}
		if(tempList.isEmpty()) {
			return new int[] {-1};
		}
		answer = new int[tempList.size()];
		for(int i = 0; i < tempList.size(); i++) {
			answer[i] = tempList.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int a = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int b = sc.nextInt();
		int[] numbers = solution(a, b);
		System.out.println(Arrays.toString(numbers));
	}
}
