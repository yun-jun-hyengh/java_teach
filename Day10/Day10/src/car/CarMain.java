package car;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		
		// 필드 값 출력
		System.out.println("회사 : " + car.compayny);
		System.out.println("모델명 : " + car.model);
		System.out.println("색깔 : " + car.color);
		System.out.println("최고속도 : " + car.maxSpeed);
		System.out.println("현재속도 : " + car.speed);
		
		// 필드 값 변경 
		car.speed = 60;
		System.out.println("현재속도 : " + car.speed);
	}
}
