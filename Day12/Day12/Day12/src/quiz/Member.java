package quiz;

public class Member {
	private String id;
	private String name;
	private int point;
	
	public Member(String id, String name, int point) {
		this.id = id;
		this.name = name;
		this.point = point;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	// 해당 정보를 출력해줄 메소드
	public void info() {
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("포인트 : " + this.point);
	}
	
}
