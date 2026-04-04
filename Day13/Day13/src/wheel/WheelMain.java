package wheel;

public class WheelMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.addWheel(); 부모 타입으로는 호출 불가
		
		System.out.println();
		
		// 부모 객체를 자식 타입으로 다시 변환해줌으로써 부모타입에서는 사용못했던 것들을
		// 쓸 수 있다.
		FourWheelBike fwb = (FourWheelBike) b;
		fwb.addWheel();
		fwb.info();
		fwb.ride();
		/*
		 * 반드시 부모 타입으로 자동 타입 변환되었던 자식 객체를 다시 자식 타입으로 
		 * 변환할 때만 강제 타입 변환을 사용할 수 있다.
		 */
	}
}
