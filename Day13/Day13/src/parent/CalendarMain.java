package parent;

class Calendar {
	String color;
	int months;
	
	public Calendar(String color, int months) {
		this.color = color;
		this.months = months;
	}
	
	void info() {
		System.out.println(color + "달력은 " + months + "월까지 있습니다.");
	}
	
	void hanging() {
		System.out.println(color + " 달력을 벽에 걸 수 있습니다.");
	}
}

class DeskCalendar extends Calendar {

	public DeskCalendar(String color, int months) {
		super(color, months);
	}
	
	@Override
	void hanging() { // Calendar 클래스에 구현한 메소드를 오버라이딩 
		System.out.println(color + " 달력을 벽에 결기 위해 고리가 추가로 필요합니다.");
	}
	
	void onTheDesk() {
		System.out.println(color + " 달력을 책상에 세울 수 있습니다.");
	}
}


public class CalendarMain {
	public static void main(String[] args) {
		/*
		 * 타입을 부모 타입으로 변환한 객체는 더 이상 자신의 클래스에 부모 클래스와 별개로 추가한 멤버들을 사용할 수 
		 * 없으며 부모 클래스에 선언된 멤버(필드와 메소드)들만 사용할 수 있다 
		 * 단) 부모 클래스의 메소드를 오버라이딩한 메소드의 경우에는 자식 객체의 것을 호출할 수 있다 
		 */
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		
		System.out.println();
		
		Calendar c = new DeskCalendar("검은색", 12);
		c.info();
		c.hanging(); // 오버라이드 한 메소드를 호출한다 
		//c.onTheDesk(); onTheDesk 이 메소드는 DeskCalendar 에만 있는 메소드이므로 
		// 부모 기준으로만 보기 때문에 사용할 수 없다 
	}
}
