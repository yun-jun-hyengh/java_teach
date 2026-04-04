package computer;

public class ComputerMain {
	public static void main(String[] args) {
		Samsang s = new Samsang();
		s.powerOn(); // Samsong 클래스에서 오버라딩된 메소드가 호출
		s.powerOff(); // Computer 클래스의 메소드가 호출
		
		Computer c = new Computer();
		c.powerOn();
		c.powerOff();
	}
}
