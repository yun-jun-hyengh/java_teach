package exam;

import java.util.Scanner;

class Bank {
	private int money;
	private int balance;
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
		this.balance = this.balance + money;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int info() {
		if(getBalance() > 1000000) {
			return -1;
		}
		return 0;
	}
}


public class BankMain {
	public static void main(String[] args) {
		/*
		 * 최대 1,000,000원까지만 저장 할 수 있도록 Bank 클래스를 
		 * 설계하세요 
		 * 돈을 계속 입력받아서 balance에 저장하고 만약 1000000원 초과 시  
		 * 프로그램 종료라는 메시지를 출력하세요 
		 * 
		 * 실행결과) 
		 *  금액입력 >> 
			100000
			현재 금액 : 100000
			금액입력 >> 
			150000
			현재 금액 : 250000
			금액입력 >> 
			550000
			현재 금액 : 800000
			금액입력 >> 
			150000
			현재 금액 : 950000
			금액입력 >> 
			50000
			현재 금액 : 1000000
			금액입력 >> 
			1
			프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		while(true) {
			System.out.println("금액입력 >> ");
			int money = sc.nextInt();
			bank.setMoney(money);
			int a = bank.info();
			if(a == -1) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("현재 금액 : " + bank.getBalance());
		}
		
	}
}
