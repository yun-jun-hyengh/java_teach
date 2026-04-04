package ex05;

import java.util.Scanner;

public class Quiz4 {
	/*
	 * 자신의 몸무게와 키를 입력받고 
	 * BMI가 저체중인지, 정상인지, 과체중인지, 비만인지 판별하는
	 * 프로그램을 작성하세요 
	 * 
	 * BMI가 18.5이면 저체중
	 * BMI가 18.5 ~ 22.9 사이면 정상
	 * BMI가 23.0 ~ 24.9 사이면 과체중
	 * BMI가 25.0 이상부터는 비만
	 * BMI 공식) 몸무게(KG) / (신장(m) * 신장(m))
	 * 
	 * 몸무게와 키는 실수타입으로 입력받도록 하고 
	 * cm => m 변환하는법
	 * 1cm = (1/100)
	 * 875.5cm => 872.5 / 100 = 8.725m
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게를 입력해 주세요 >> ");
		double kg = sc.nextDouble();
		System.out.println("키를 입력해 주세요 >> ");
		double cm = sc.nextDouble();
		double bmi = kg / ((cm / 100) * (cm / 100));
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi >= 18.5 && bmi <= 22.9) {
			System.out.println("정상");
		} else if(bmi >= 23.0 && bmi <= 24.9) {
			System.out.println("과체중");
		} else if(bmi >= 25.0) {
			System.out.println("비만");
		}
	}
}
