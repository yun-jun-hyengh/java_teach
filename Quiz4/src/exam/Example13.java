package exam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example13 {
	
	public static int solution(int a, int b, int c, int d) {
		int answer = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		int [] nums = {a, b, c, d};
		for(int num : nums) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		int maxCount = 0;
		for(int count : countMap.values()) {
			if(count > maxCount) {
				maxCount = count;
			}
		}
		if(maxCount == 4) {
			int maxNum = 0;
			for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
		        if (entry.getValue() == 4) {
		            maxNum = entry.getKey();
		            break;
		        }
		    }
		    answer = 1111 * maxNum;
		} else if(maxCount == 3) {
			int p = 0;
			int q = 0;
			for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
		        if (entry.getValue() == 3) {
		            p = entry.getKey();
		        } else {
		            q = entry.getKey();
		        }
		    }
		    answer = (int) Math.pow(10 * p + q, 2);
		} else if(maxCount == 2) {
			Arrays.sort(nums);
			if(nums[0] == nums[1] && nums[2] == nums[3]) {
				answer = (nums[2] + nums[0]) * Math.abs(nums[2] - nums[0]);
			} else if(nums[0] == nums[1]) {
				answer = nums[2] * nums[3];
			} else if(nums[1] == nums[2]) {
				answer = nums[0] * nums[3];
			} else if(nums[2] == nums[3]) {
				answer = nums[0] * nums[1];
			}
		} else {
			int min = Integer.MAX_VALUE;
		    for (int num : nums) {
		        if (num < min) min = num;
		    }
		    answer = min;
		}
        return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int a = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int b = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int c = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int d = sc.nextInt();
		System.out.println(solution(a, b, c, d));
	}
}
