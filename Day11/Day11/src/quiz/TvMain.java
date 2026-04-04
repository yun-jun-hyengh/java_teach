package quiz;

public class TvMain {
	public static void main(String[] args) {
		/*
		 * 다음 main() 메소드를 실행하였을 때 
		 * 다음과 같이 출력되는 Tv 클래스를 작성하세요
		 * 
		 * LG에서 만든 2017년형 32인치 TV
		 */
		Tv tv = new Tv("LG",2017,32);
		tv.show();
	}
}
