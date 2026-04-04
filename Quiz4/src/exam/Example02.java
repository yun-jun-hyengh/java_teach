package exam;

import java.util.Scanner;

class Friend {
	private String name;
	private String phoneNumber;
	private String school;
	
	public Friend(String name, String phoneNumber, String school) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
}

public class Example02 {
	public static void main(String[] args) {
		/*
		 * 친구정보를 입력받아 Friend 객체를 생성하고 이들을 Friend 객체 배열에 
		 * 저장하세요 
		 * 
		 * 실행결과)
		 * 친구를 3명 등록해 주세요 !! >> 
		 * 감자바 010-1111-1111 초
		 * 김자바 010-2222-2222 중
		 * 윤준형 010-3528-8515 고
		 * 
		 * 이름 : 감자바 	핸드폰번호 : 010-1111-1111 	학교: 초
		 * 이름 : 김자바 	핸드폰번호 : 010-2222-2222 	학교: 중
		 * 이름 : 윤준형 	핸드폰번호 : 010-3333-3333 	학교: 고
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("몇명을 등록하시겠습니까? >> ");
		int cnt = sc.nextInt();
		Friend[] friend = new Friend[cnt];
		System.out.println("친구를 " + cnt + "명 등록해 주세요!!");
		
		for(int i = 0; i < friend.length; i++) {
			String name = sc.next();
			String phone = sc.next();
			String school = sc.next();
			friend[i] = new Friend(name, phone, school);
		}
		
		for(int i = 0; i < friend.length; i++) {
			System.out.print("이름 : " + friend[i].getName());
			System.out.print("     ");
			System.out.print("핸드폰 번호 : " + friend[i].getPhoneNumber());
			System.out.print("     ");
			System.out.print("학교 : " + friend[i].getSchool());
			System.out.println();
		}
	}
}
