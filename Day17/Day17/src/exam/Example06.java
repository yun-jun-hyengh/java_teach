package exam;

import java.util.LinkedList;

public class Example06 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		list.addFirst(100); // 리스트의 가장 앞에 데이터가 추가 
		list.addLast(200); // 리스트의 가장 뒤에 데이터가 추가 
		System.out.println(list);
		
		// 링크드 리스트는 데이터를 추가할 때 기존에 연결된 링크를 끊고 
		// 데이터에 새롭게 주소를 연결한다.
		list.add(1, 150);
		System.out.println(list);
		
		// 값 삭제 
		list.remove(1); // 1번째 인덱스 제거 
		System.out.println(list);
		
		list.remove(Integer.valueOf(200));
		System.out.println(list);
		
		list.set(0, 1);
		System.out.println(list);
		
		// 리스트 전부 삭제 
		list.clear();
		System.out.println(list);
		
		/*
		 * ArrayList, LinkedList 차이 
		 * - 요소의 추가, 삭제, 검색 등의 작업에 따라 성능 특성이 다름
		 * - 요소의 추가와 삭제가 자주 발생하는 경우에는 LinkedList
		 * - 요소의 접근이 자주 필요한 경우에(즉 검색) 는 ArrayList
		 */
	}
}
