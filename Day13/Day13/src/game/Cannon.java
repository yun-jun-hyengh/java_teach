package game;

public class Cannon extends Weapon {
	
	@Override
	int fire() { // 오버라이딩
		return 10; // 대포는 10명을 살상 !! 
	}

}
