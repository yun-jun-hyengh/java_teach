package exam;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length()-4, code.length());
        System.out.println(lastFourWords);
	}
}
