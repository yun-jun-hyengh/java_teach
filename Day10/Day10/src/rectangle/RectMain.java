package rectangle;

import java.util.Scanner;

public class RectMain {
	public static void main(String[] args) {
		/*
		 * Rectangle 클래스를 생성하여 가로와 세로를 필드로 선언하고  
		 * 사각형의 넓이를 구하세요!! 
		 * 가로 x 세로 !!  
		 * 
		 * 가로입력 >> 10
		 * 세로입력 >> 20
		 * 사각형의 면적은 : 200
		 */
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		System.out.println("가로입력 >> ");
		rect.width = sc.nextInt();
		System.out.println("세로입력 >> ");
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적은 : " + rect.getArea());
	}
}
