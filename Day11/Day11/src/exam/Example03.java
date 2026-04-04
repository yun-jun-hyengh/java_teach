package exam;

class Circle {
	public int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class Example03 {
	/*
	 * 객체배열
	 * - 자바에서는 기본 타입 데이터뿐 아니라, 객체를 원소로 하는 객체배열도 
	 * 만들 수 있다.
	 * - 자바의 객체 배열은 객체에 대한 레퍼런스를 원소로 갖는 배열 
	 */
	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new Circle(i); // i번째 원소 생성
		}
		// 배열의 모든 Circle 객체의 면적 출력
		for(int i = 0; i < c.length; i++) {
			System.out.println((int)c[i].getArea() + " ");
		}
		 
	}
}
