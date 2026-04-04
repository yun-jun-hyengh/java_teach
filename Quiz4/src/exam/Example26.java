package exam;

import java.util.Scanner;

public class Example26 {
	
	public static String solution(String my_string, int m, int c) {
		String answer = "";
		int length = my_string.length();
		int height = (int) Math.ceil((double) length / m);
		
		char[][] result = new char[height][m];
		int idx = 0;
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < m; j++) {
				if(idx < length) {
					result[i][j] = my_string.charAt(idx++);
				} else {
					result[i][j] = ' '; // 공백처리 
				}
			}
		}
		
		for(int i = 0; i < height; i++) {
			answer = answer + result[i][c - 1];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >> ");
		String str = sc.nextLine();
		System.out.println("한줄에 몇글자 >> ");
		int width = sc.nextInt();
		System.out.println("열 수 입력 >> ");
		int colIndex = sc.nextInt();
		
		System.out.println(solution(str, width, colIndex));
		
		
	}
}
