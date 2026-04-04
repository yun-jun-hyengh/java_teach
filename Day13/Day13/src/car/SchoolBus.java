package car;

public class SchoolBus extends Bus {
	
	SchoolBus(int peopleNum){
		super(peopleNum); // Bus 클래스의 생성자를 호출
	}
	
	@Override
	void takePerson() {
		super.takePerson();
		System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
	}
	
	@Override
	void ride() {
		System.out.println("시속 50km 로 천천히 달립니다.");
	}

}
