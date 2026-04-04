package exam;

import java.util.ArrayList;
import java.util.List;

public class Example40 {
	
	public static String[] solution(String[] strArr) {
		String[] answer = {};
		List<String> list = new ArrayList<>();
		for(String s : strArr) {
			if(!s.contains("ad")) {
				list.add(s);
			}
		}
		answer = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] arr1 = {"and", "notad", "abcd"};
		String[] arr2 = {"there", "are", "no", "a", "ds"};
		
		String[] result1 = solution(arr1);
		String[] result2 = solution(arr2);
		
		for(String s : result1) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(String s : result2) {
			System.out.print(s + " ");
		}
	}
}
