package ex07;

public class Quiz1 {
	/*
	 * 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 
	 * 구해서(x, y) 형태로 출력해보세요
	 * 단 x, y는 10이하의 자연수 입니다
	 * 
	 * 답)
	 * (5, 8)
	 * (10, 4)
	 * 4 * x + 5 * y 한 결과가 60이 나와야 조건에 부합됩니다 !! 
	 */
	public static void main(String[] args) {
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((4 * x) + (5 * y) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
