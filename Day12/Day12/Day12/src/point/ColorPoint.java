package point;

public class ColorPoint extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(this.color);
		showPoint(); // Point 클래스의 showPoint() 메소드 호출 
	}
}
