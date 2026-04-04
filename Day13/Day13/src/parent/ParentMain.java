package parent;

class Parent{} // 부모클래스
class Child extends Parent{} // Parent 클래스를 상속받는 자식 클래스 

public class ParentMain {
	public static void main(String[] args) {
		Parent p1 = new Parent(); // p1 객체 생성(부모 클래스 객체 생성)
		Child c1 = new Child(); // c1 객체 생성 (자식 클래스 객체 생성)
		
		// 자식 -> 부모 객체로 변환
		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1;
		//Child c2 = p1; // 자동타입변환 안됨 (부모가 자식으로는 타입변환이 안된다)
		
		/*
		 * Child 객체 c1 타입을 Parent로 변환해 만든 p3는 여전히 c1 객체라는 걸 확인할 수 있다 
		 * 타입을 변환한다고 객체가 바뀌는게 아닌 객체는 보존되고 사용만 부모 객체처럼 사용 한다 
		 */
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있다.");
		}
	}
}
