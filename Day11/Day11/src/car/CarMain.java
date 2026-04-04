package car;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("회사명 : " + car1.company);
		System.out.println();
		
		Car car2 = new Car("SM5");
		System.out.println("회사명 : " + car2.company);
		System.out.println("모델명 : " + car2.model);
		System.out.println();
		
		Car car3 = new Car("SM5","검정");
		System.out.println("회사명 : " + car3.company);
		System.out.println("모델명 : " + car3.model);
		System.out.println("색상 : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("SM5","검정", 200);
		System.out.println("회사명 : " + car4.company);
		System.out.println("모델명 : " + car4.model);
		System.out.println("색상 : " + car4.color);
		System.out.println("최고속도 : " + car4.maxSpeed);
		
	}
}
