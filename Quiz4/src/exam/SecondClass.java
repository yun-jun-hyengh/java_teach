package exam;

import java.util.Scanner;

public class SecondClass {
	FirstClass cls = new FirstClass();
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("숫자 세개를 입력하세요 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		cls.setA(a);
		cls.setB(b);
		cls.setC(c);
	}
	
	public void sumResult() {
		System.out.println(cls.result());
	}
}
