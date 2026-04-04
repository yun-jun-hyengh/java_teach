package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example14 {
	
	public static int[] solution(int[] arr) {
		int[] stk = {};
		List<Integer> list = new ArrayList<>();
		int i = 0;
		while(i < arr.length) {
			if(list.isEmpty()) {
				list.add(arr[i]);
				i++;
			} else if(list.get(list.size() - 1) < arr[i]) {
				list.add(arr[i]);
				i++;
			} else {
				list.remove(list.size() - 1);
			}
		}
		stk = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            stk[j] = list.get(j);
        }

		return stk;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 5, 3};
		int[] result = solution(arr);
        System.out.println(Arrays.toString(result));  // 출력: [1, 4, 5, 6]
	}
}
