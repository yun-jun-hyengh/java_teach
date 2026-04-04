package quiz;

public class Tv {
	public String company;
	public int month;
	public int inch;
	
	public Tv(String company, int month, int inch) {
		this.company = company;
		this.month = month;
		this.inch = inch;
	}
	
	public void show() {
		System.out.println(this.company + "에서 만든 " + this.month 
				+ "년형 " + this.inch + "TV");
	}
}
