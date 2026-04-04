package Test2;

import Test1.Test;

public class TestMain2 {
	
	
	
	public static void main(String[] args) {
		
		Test test = new Test();
		
		// public 접근
		test.public_name = "윤준형";
		System.out.println(test.public_name);
		
		// protected : 다른 패키지므로 접근 불가 !! 접근하려면 상속받아야됨
		
		// default 접근 : 다른 패키지므로 접근 불가 !! 
		//test.default_name = "장길동";
		//System.out.println(test.default_name);
	}
}
