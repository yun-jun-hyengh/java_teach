package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example11 {
	
	public static int[] solution(String[] intStrs, int k, int s, int l) {
		List<Integer> list = new ArrayList<>();
		int[] answer = {};
		for(String a : intStrs) {
			if(a.length() >= s + l) {
				String sub = a.substring(s, s + l);
				int value = Integer.parseInt(sub);
				
				if(value > k) {
					list.add(value);
				}
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
		String[] intStrs = new String[3];
		for(int i = 0; i < intStrs.length; i++) {
			System.out.print(i + 1 + "번째 문자열 입력 >> ");
			intStrs[i] = sc.nextLine();
		}
		System.out.println("숫자입력 >> ");
		int k = sc.nextInt();
		System.out.println("시작지점 >> ");
		int s = sc.nextInt();
		System.out.println("길이 >> ");
		int l = sc.nextInt();
		int[] result = solution(intStrs, k, s, l);
		for(int n : result) {
			System.out.println(n);
		}
	}
}
