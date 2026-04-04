package bookmark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> book = new ArrayList<Book>();
		
		while(true) {
			System.out.println("---------------- 도서 관리 시스템 ----------------");
			System.out.println("1.입력|2. 출력(전체조회)|3. 검색(제목, 저자, 출판사)|4. 삭제|5. 종료");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서전체조회");
			System.out.println("3. 도서검색(제목,저자,출판사)");
			System.out.println("4. 도서삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("-----------------------------------------------");
			System.out.println("메뉴를 선택해 주세요 >> ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("책 번호입력 >> ");
				int bookNum = sc.nextInt();
				
				System.out.println("책 제목입력 >> ");
				String bookTitle = sc.next();
				
				System.out.println("책 저자입력 >> ");
				String bookAuthor = sc.next();
				
				System.out.println("책 출판사입력 >> ");
				String bookPublisher = sc.next();
				Book bk = new Book(bookNum, bookTitle, bookAuthor, bookPublisher);
				book.add(bk);
				
			} else if(choice == 2) {
				for(Book item : book) {
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("책 번호 : " + item.getNum());
					System.out.println("책 제목 : " + item.getTitle());
					System.out.println("책 저자 : " + item.getAuthor());
					System.out.println("책 출판사 : " + item.getPublisher());
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				}
				
			} else if(choice == 3) {
				System.out.println("검색 방법을 선택해 주세요 >> ");
				System.out.println("1.제목|2.저자|3.출판사");
				int searh_choice = sc.nextInt();
				
				if(searh_choice == 1) {
					System.out.println("도서 제목을 입력해 주세요 >> ");
					String title = sc.next();
					for(Book bk : book) {
						if(title.equals(bk.getTitle())) {
							System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
							System.out.println("책 번호 : " + bk.getNum());
							System.out.println("책 제목 : " + bk.getTitle());
							System.out.println("책 저자 : " + bk.getAuthor());
							System.out.println("책 출판사 : " + bk.getPublisher());
							System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
						}
					}
				} else if(searh_choice == 2) {
					System.out.println("도서 저자를 입력해 주세요 >> ");
					String author = sc.next();
					for(Book bk : book) {
						if(author.equals(bk.getAuthor())) {
							System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
							System.out.println("책 번호 : " + bk.getNum());
							System.out.println("책 제목 : " + bk.getTitle());
							System.out.println("책 저자 : " + bk.getAuthor());
							System.out.println("책 출판사 : " + bk.getPublisher());
							System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
						}
					}
				} else if(searh_choice == 3) {
					System.out.println("도서 출판사를 입력해 주세요 >> ");
					String publisher = sc.next();
					for(Book bk : book) {
						if(publisher.equals(bk.getPublisher())) {
							System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
							System.out.println("책 번호 : " + bk.getNum());
							System.out.println("책 제목 : " + bk.getTitle());
							System.out.println("책 저자 : " + bk.getAuthor());
							System.out.println("책 출판사 : " + bk.getPublisher());
							System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
						}
					}
				}
				
			} else if(choice == 4) {
				System.out.println("삭제할 도서 번호를 입력해 주세요 >> ");
				int num = sc.nextInt();
				Iterator<Book> it = book.iterator();
				while(it.hasNext()) {
					Book bk = it.next();
					if(bk.getNum() == num) {
						it.remove();
					}
				}
			} else if(choice == 5) {
				System.out.println("프로그램 종료");
				System.exit(0);
			}
			
		}
		
	}
}
