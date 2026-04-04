package exam;

class Thread1 extends Thread {
	public Thread1() {
		setName("Thread Park");
	}
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + " 실행");
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + " 실행");
		}
	}
}

public class Example07 {
	public static void main(String[] args) {
		/*
		 * 스레드의 이름
		 * - 스레드는 이름을 가지고 있으며, 디버깅 할 때 어떤 스레드가 
		 * 무슨 작업을 하는지 검사할 때 가끔 쓰임 
		 */
		Thread mainThread = Thread.currentThread(); // 현재 스레드 참조 
		System.out.println("프로그램 시작 스레드 : " + mainThread.getName());
		
		Thread1 thread1 = new Thread1();
		System.out.println("작업 스레드 : " + thread1.getName());
		thread1.start();
		
		Thread2 thread2 = new Thread2();
		System.out.println("작업 스레드 : " + thread2.getName());
		thread2.start();
		
		
	}
}
