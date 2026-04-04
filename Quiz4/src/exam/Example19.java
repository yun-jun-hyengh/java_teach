package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example19 {
	
	public static String[] solution(String[] str_list) {
		String[] answer = {};
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < str_list.length; i++) {
			if(str_list[i].equals("l")) {
				for(int j = 0; j < i; j++) {
					list.add(str_list[j]);
				}
				break;
			} else if(str_list[i].equals("r")) {
				for(int j = i + 1; j < str_list.length; j++) {
					list.add(str_list[j]);
				}
				break;
			}
		}
		if(list.isEmpty()) {
			return new String[] {};
		}
		answer = new String[list.size()];
		answer = list.toArray(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[num];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("입력 >> ");
			arr[i] = sc.nextLine();
		}
		String[] str = solution(arr);
		System.out.println(Arrays.toString(str));
	}
}
