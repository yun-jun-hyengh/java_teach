package computer;

public class ComputerMain {
	public static void main(String[] args) {
		Computer com = new Computer("인텔 i7-8700", 8000);
		System.out.println(com.cpu);
		System.out.println(com.ram);
	}
}
