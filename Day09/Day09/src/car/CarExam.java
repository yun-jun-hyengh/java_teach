package car;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car(); // 클래스를 이용해 인스턴스 생성 
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다.");
		
		car.wheel = 5; // wheel의 값을 5로 변경
		System.out.println("wheel의 개수는 " + car.wheel + "개 입니다.");
		
		car.ride();
		car.stop();
	}
	
}
