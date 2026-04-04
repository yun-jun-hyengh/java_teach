package tv;

public class IPTelevision extends Television {
	String contents;
	
	// Television으로부터 상속받은 필드를 그대로 사용할 수 있다.
	public IPTelevision(String model) {
		this.model = model;
	}
	
	void settopBoxOn() {
		System.out.println("셋톱박스를 켭니다.");
	}
	
	void settopBoxOff() {
		System.out.println("셋톱박스를 끕니다.");
	}
	
	void changeContents(String contents) {
		this.contents = contents;
		System.out.println(contents + "(으)로 전환합니다.");
	}
}
 