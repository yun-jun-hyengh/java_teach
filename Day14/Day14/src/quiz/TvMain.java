package quiz;

class TV {
	private int size;
	public TV(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

class ColorTV extends TV {
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ColorTV(int size, String color) {
		super(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	public void printProperty() {
		System.out.println(this.getSize() + "인치 " + getColor());
	}
	
}

public class TvMain {
	public static void main(String[] args) {
		/*
		 * 다음 TV클래스가 있고
		 * main() 메소드의 실행결과를 참고하여 TV 클래스를 상속받은 ColorTV 클래스를
		 * 작성하세요 
		 * 
		 * 실행결과)
		 * 32인치 검정색
		 */
		ColorTV myTV = new ColorTV(32, "검정색");
		myTV.printProperty();
	}
}
