package exam;

public class Example02 {
	public static void main(String[] args) {
		/*
		 * 스레드 : 프로그램 내에서 동작하는 작업 단위를 말하며 
		 * 스레드를 통해 동시에 여러 가지 작업 가능 
		 * 
		 * 프로그램 : 프로그래밍 코드의 집합체 
		 * 
		 * 프로세스 : 프로그램의 한 단위를 말하며 실행 중인 프로그램으로 
		 * 메모리에 독립적으로 저장되어 실행 
		 * 
		 * 멀티태스킹(Mult tasking) : 두 가지 이상의 작업을 동시에 처리하는 것 
		 * 
		 * 멀티스레드 : 애플리케이션 내부에서 멀티 태스킹
		 * 스레드(Thread) : 한 가지 작업의 실행 흐름 
		 * 
		 * 싱글 스레드는 메인 스레드가 종료되면 프로세스도 종료되나 
		 * 멀티 스레드는 실행 중인 스레드가 있다면 프로세서는 종료되지 않음 
		 */
		System.out.println(Thread.currentThread().getName());
	}
}
