package quiz;

import java.util.Scanner;
import java.util.Stack;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 현우는 숫자를 좋아한다. 항상 숫자를 가지고 장난을 하고 숫자로 무언가 만들기를 
		 * 취미생활로 즐기고 있다 하루는 어떤 숫자를 쓰고 그 수를 거꾸로 쓰기로 했다 
		 * 어떤 수 N이 입력되면 그 수를 거꾸로 출력하는 프로그램을 작성하세요 
		 * 
		 * 입력 : 2571
		 * 출력 : 1752
		 * 
		 * 입력 : 1200
		 * 출력 : 0021
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		String strNum = String.valueOf(num);
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < strNum.length(); i++) {
			stack.push(strNum.charAt(i));
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}
}
