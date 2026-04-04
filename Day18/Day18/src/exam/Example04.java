package exam;

public class Example04 {
	public static void main(String[] args) {
		// 익명 객체를 이용해 처리하는 법 
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(3000); // 3초 딜레이 
					System.out.println("화면이동");
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}
}
