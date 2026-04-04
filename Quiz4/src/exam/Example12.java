package exam;

import java.util.Scanner;

public class Example12 {
	
	public static String solution(String my_string, int[][] queries) {
		String answer = "";
		StringBuilder sb = new StringBuilder(my_string);

	    for (int i = 0; i < queries.length; i++) {
	        int start = queries[i][0];
	        int end = queries[i][1];

	        String part = sb.substring(start, end + 1);
	        String reversedPart = new StringBuilder(part).reverse().toString();

	        sb.replace(start, end + 1, reversedPart);
	    }
	    answer = sb.toString();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String my_string = sc.nextLine();
		int[][] arr = {
			    {2, 3},
			    {0, 7},
			    {5, 9},
			    {6, 10}
			};
		System.out.println(solution(my_string, arr));
	}
}
