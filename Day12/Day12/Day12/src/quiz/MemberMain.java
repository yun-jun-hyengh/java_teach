package quiz;

public class MemberMain {
	public static void main(String[] args) {
		/*
		 * 회원(Member) 클래스는 회원 아이디를 나타내는 id(문자열)과 
		 * 회원 이름을 나타내는 name(문자열), 회원의 point를 나타내는 point(정수)
		 * 필드를 가지고 있다 
		 * 
		 * 메소드는 각 회원의 필드의 값들을 변경 혹은 입력하는 set메소드와 이를 반환하는
		 * get 메소드를 가지고 있다
		 * 
		 * 모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻지 못하도록 private
		 * 으로 접근 제한을 막으세요!!
		 * 
		 *  실행결과)
		 *  아이디 : eeee
			이름 : 윤준형
			포인트 : 20000
			
			아이디 : rrrr
			이름 : 윤준홍
			포인트 : 10000
		 */
		
		Member member = new Member("eeee", "윤준형", 20000);
		member.info();
		
		Member member1 = new Member("rrrr", "윤준홍", 2000);
		member1.info();
	}
}
