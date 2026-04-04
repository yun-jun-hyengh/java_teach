package bookmark;
/***
 * 도서 관리 프로그램 
 * 1.입력 | 2. 출력(전체조회) | 3. 검색(제목, 저자, 출판사) | 4. 삭제 | 5. 종료
 */
public class Book {
	private int num; // 도서번호
	private String title; // 책 제목
	private String author; // 작가이름
	private String publisher; // 출판사 
	
	public Book(int num, String title, String author, String publisher) {
		this.num = num;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
