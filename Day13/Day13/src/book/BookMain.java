package book;

public class BookMain {
	public static void main(String[] args) {
		Comic comicbook = new Comic("주머니 괴물","미상",true);
		comicbook.info_title();
		comicbook.info_author();
		comicbook.info_color();
	}
}
