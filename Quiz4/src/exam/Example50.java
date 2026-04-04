package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Example50 {
	
	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);

            if (c1 == c2) {
                return s1.compareTo(s2);
            }
            return c1 - c2;
        });
		answer = Arrays.copyOf(strings, strings.length);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int n = sc.nextInt();
		String[] str = {"sun", "bed", "car"};
		String[] result = solution(str, n);
		
		for(String a : result) {
        	System.out.print(a + "  ");
        }
	}
}
