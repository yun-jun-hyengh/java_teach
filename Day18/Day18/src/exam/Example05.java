package exam;

import java.awt.Toolkit;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 메인스레드(싱글스레드)만 이용한 경우 
		 * - 한가지 작업이 끝나야 다음 작업을 처리 
		 * 즉) 멀티태스킹이 안됨 
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500); // 0.5초간 대기 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
