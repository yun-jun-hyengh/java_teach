package ex04;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 논리연산자
		 * 종류) &&, ||, ^, !
		 * 
		 * &&(논리곱) : 두 항이 모두 true이면 true, 나머지는 false
		 * ||(논리합) : 두 항중 하나라도 true이면 true, 모두 false면 false
		 * ^(배타적 논리합) : 두 항이 다른 값이면 true, 같으면 false;
		 * !(논리부정) : 식이 true이면 false, false면 true
		 */
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;
		
		System.out.println("##### 논리곱 #####");
		System.out.println(b1 && b2);
		System.out.println(b1 && b3);
		System.out.println(b2 && b4);
		System.out.println();
		
		System.out.println("##### 논리합 #####");
		System.out.println(b1 || b2);
		System.out.println(b1 || b3);
		System.out.println(b2 || b4);
		System.out.println();
		
		System.out.println("##### 배타적 논리합 #####");
		System.out.println(b1 ^ b2); // 다른 값이므르 true
		System.out.println(b2 ^ b4); // 같은 값이므로 false
		System.out.println();
		
		System.out.println("##### 논리부정 #####");
		boolean power = false; // 전원꺼짐
		System.out.println(power);
		
		power = !power; // false => true로 바꿈
		System.out.println(power);
		
		
		
		
		
	}
}
