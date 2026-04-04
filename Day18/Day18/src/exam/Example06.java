package exam;

import java.awt.Toolkit;

/*
 * 멀티스레드를 이용한 경우 
 * - 동시작업이 가능하다.
 */

class BeepoTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}
	
}

public class Example06 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepoTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
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
