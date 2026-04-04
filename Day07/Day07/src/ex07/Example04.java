package ex07;

public class Example04 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.print("*");
			i++;
			int j = 1;
			while(j <= 10) {
				j++;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
