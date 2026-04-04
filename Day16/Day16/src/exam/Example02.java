package exam;

class Account {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance = balance + money;
	}
	
	public void withdraw(int money) throws BalanceException {
		System.out.println("현재잔고 : " + balance);
		if(balance < money) {
			throw new BalanceException("잔고가 부족합니다.");
		}
		balance = balance - money;
		
	}
}

class BalanceException extends Exception {
	public BalanceException(String message) {
		super(message);
	}
}

public class Example02 {
	/*
	 * 사용자 정의 예외 
	 * - 프로그램을 개발하다 보면 자바 표준 API에 제공하는 예외 클래스
	 * 만으로는 다양한 종류의 예외를 표현할 수 없다.
	 * - 개발자가 직접 정의해서 제작한다.
	 */
	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		try {
			account.withdraw(15000);
		} catch(BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}
}
