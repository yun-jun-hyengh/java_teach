package quiz;

import java.util.Scanner;

/***
 * 
 * 
		   이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone 클래스를 작성하고, 
		   실행 예시와 같이 작동하는 PhonBook 클래스를 작성하라.
			
			실행)
			1.입력|2.검색|3.프로그램종료
			메뉴를 선택해주세요 >> 1
			인원수 >> 3
			이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>황기태 777-7777
			이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>나명품 999-9999
			이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>최자바 333-1234
			메뉴를 선택해주세요 >> 2
			검색할 이름 >>황기순
			황기순이 없습니다.
			메뉴를 선택해주세요 >> 2
			검색할 이름 >>최자바
			최자바의 번호는 333-1234 입니다.
			메뉴를 선택해주세요 >> 3
			검색할 이름 >>그만
		 
 *
 */

class Phone{
	// 필드
	private String name;
	private String tel;
	
	// 생성자
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	// get set 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}

public class PhoneMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Phone[] phone = null;
		
		while(true) {
			System.out.println("1.입력|2.검색|3.프로그램종료");
			System.out.println("메뉴를 선택해 주세요 >> ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("인원수 >> ");
				int count = sc.nextInt();
				phone = new Phone[count];
				
				for(int i = 0; i < phone.length; i++) {
					System.out.println("이름과 전화번호(이름과 번호 입력) >> ");
					String name = sc.next();
					String phonenumber = sc.next();
					phone[i] = new Phone(name, phonenumber);
				}
				sc.nextLine();
			} else if(choice == 2) {
				System.out.println("검색할 이름 >> ");
				String search_name = sc.next();
				boolean found = false;
				for(int i = 0; i < phone.length; i++) {
					if(phone[i].getName().equals(search_name)) {
						System.out.println(search_name + "의 번호는 " + phone[i].getTel() + "입니다.");
						found = true;
						break;
					} 
				}
				
				if(!found) {
					System.out.println(search_name + " 이름은 없습니다.");
				}
			} else if(choice == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
