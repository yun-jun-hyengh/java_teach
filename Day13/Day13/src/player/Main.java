package player;

public class Main {
	public static void main(String[] args) {
		SoccerPlayer player = new SoccerPlayer("박지성", 42, 12);
		
		System.out.println("이름 : " + player.name);
		System.out.println("나이 : " + player.age);
		System.out.println("골수 : " + player.goalNum);
	}
}
