package ex08;

public class Example09 {
	public static void main(String[] args) {
		/*
		 * 배열에서 단어만 추출하여 출력하기 
		 * 
		 * 실행결과 ) LOVE
		 */
		char[] cards = {'1','L','O','2','V','3','E'};
		
		for(int i = 0; i < cards.length; i++) {
			if(cards[i] >= 65 && cards[i] <= 90) { // A ~ Z(대문자) 
				System.out.printf("%c", cards[i]);
			}
		}
	}
}
