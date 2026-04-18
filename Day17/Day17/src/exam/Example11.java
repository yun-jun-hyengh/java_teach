package exam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example11 {
	public static void main(String[] args) {
		/*
		 * 반복자(Iterator)
		 * - Iterator<E>은 List 컬렉션에서 제공하는 인터페이스로 
		 * 반복하다 라는 뜻을 지니고 있다 
		 * - List 컬렉션의 요소를 순회하여 하나씩 추출하는데 사용함 
		 */
		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		// Iterator 객체 가져오기
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
