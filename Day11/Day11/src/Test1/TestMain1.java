package Test1;

public class TestMain1 {
	public static void main(String[] args) {
		
		Test test = new Test();
		
		// public 접근
		test.public_name = "홍길동";
		System.out.println(test.public_name);
		
		// protected 접근
		test.protected_name = "김길동";
		System.out.println(test.protected_name);
		
		// default 접근
		test.default_name = "장길동";
		System.out.println(test.default_name);
		
		// private 접근 : getter setter 접근
		test.setPrivate_name("장독대");
		System.out.println(test.getPrivate_name());
	}
}
