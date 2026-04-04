package parent;

class Parent{}
class Child extends Parent{}

public class ParentMain {
	public static void main(String[] args) {
		Parent p1 = new Parent(); // p1 객체 생성
		Child c1 = new Child(); // p2 객체 생성
		
		// 자식 -> 부모 객체로 변환
		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1;
		//Child c2 = p1;
		
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있다.");
		}
	}
}
