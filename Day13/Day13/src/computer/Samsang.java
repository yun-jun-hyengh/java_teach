package computer;

public class Samsang extends Computer {
	
	@Override
	void powerOn() {
		// super 키워드는 부모 클래스에서 상속받은 필드나 메소드를 자식클래스에서 
		// 참조하는데 사용한다.
		super.powerOn();
		System.out.println("아이 러브 삼성");
	}

}
