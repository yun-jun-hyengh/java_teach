package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example48 {
	
	public static int[] solution(int n, int[] slicer, int[] num_list) {
		int[] answer = {};
		int a = slicer[0];
		int b = slicer[1];
		int c = slicer[2];
		
		List<Integer> list = new ArrayList<>();
		
		switch(n) {
		case 1:
			for(int i = 0; i <= b && i < num_list.length; i++) {
				list.add(num_list[i]);
			}
			break;
		case 2:
			for(int i = a; i < num_list.length; i++) {
				list.add(num_list[i]);
			}
			break;
		case 3:
			for(int i = a; i <= b && i < num_list.length; i++) {
				list.add(num_list[i]);
			}
			break;
		case 4:
			for(int i = a; i <= b && i < num_list.length; i += c) {
				list.add(num_list[i]);
			}
			break;
		}
		answer = list.stream().mapToInt(i->i).toArray();
        return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		int[] abc = {1, 5, 2};                 
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        int[] result = solution(num, abc, arr);
        
        for(int a : result) {
        	System.out.print(a + "  ");
        }
	}
}
