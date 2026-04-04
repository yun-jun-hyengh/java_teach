package exam;

class Coffee {
	public void make() {}
}

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 익명클래스
		 * - 이름이 없는 클래스를 의미 
		 * - 클래스의 선언과 객체의 생성을 동시에 하므로 단 한번만 사용할 수 있고
		 * 오직 하나의 객체만을 생성할 수 있는 일회용 클래스 
		 */
		
		// Coffee 클래스를 상속 받는 익명 클래스 
		Coffee coffee = new Coffee() {
			
			// 메소드 오버라이딩 
			@Override
			public void make() {
				System.out.println("Override Make !! ");
			}
			
			// 메소드 
			/*
			 * new Coffee()를 통해 생성되는 인스턴스는 Coffee 클래스가 아닌
			 * 상단에 Coffee 클래스를 상속받는 익명 클래스 이기 때문에 
			   Coffee 클래스 안에 serve() 메소드가 선언되어 있지 않기 때문 
			 */
			public void serve() {
				System.out.println("serve");
			}
		};
		coffee.make();
		//coffee.serve();
	}
}
