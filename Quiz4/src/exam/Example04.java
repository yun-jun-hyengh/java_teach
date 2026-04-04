package exam;

class MyThread extends Thread {
	public void run() {
		int localVar = 10; // 스레드 마다 별도의 스택에 저장됨 
		System.out.println(Thread.currentThread().getName() + " : " + localVar);
	}
}

public class Example04 {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.start();
		t2.start();
	}
}
