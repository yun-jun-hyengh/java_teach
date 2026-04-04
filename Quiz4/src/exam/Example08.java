package exam;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;
        int number1 = 0;
        for(int i=0; i<1; i++){
            answer += number % 100;
            number1 = number /= 100;
        }
        System.out.println(answer + number1);
        
	}
}
