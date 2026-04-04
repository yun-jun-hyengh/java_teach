package exam;

public class Example12 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abc");
		
		// 문자열 추가 
		System.out.println(sb.append("bbb"));
		System.out.println(sb.append(4));
		
		// 문자열 삽입
		System.out.println(sb.insert(2, "afder"));
		
		// 문자열 삭제
		System.out.println(sb.delete(5, sb.length()));
		
		// 문자열 뒤집기
		System.out.println(sb.reverse());
	}
}
