package point;

public class PointMain {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(1);
		p.setY(2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setX(3);
		cp.setY(4);
		cp.setColor("검은색");
		cp.showColorPoint();
	}
}
