package interfaceTest;

// SmartPhone 클래스는 PDA 클래스를 상속받고 
// MobilePhoneInterface, MP3Interface 선언된 추상 메소드를 모두 구현 
public class SmartPhone extends PDA 
implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르르릉~~!!");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 왔어요.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("음악 연주합니다.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("음악 중단합니다.");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자갑니다.");
	}

	@Override
	public void receiverSMS() {
		// TODO Auto-generated method stub
		System.out.println("문자왔어요.");
	}
	
	public void schedule() {
		System.out.println("일정관리합니다.");
	}

}
