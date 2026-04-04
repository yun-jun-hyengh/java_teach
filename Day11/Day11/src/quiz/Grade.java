package quiz;

public class Grade {
	public int mat;
	public int sci;
	public int eng;
	
	public Grade(int mat, int sci, int eng) {
		this.mat = mat;
		this.sci = sci;
		this.eng = eng;
	}
	
	public int average()
	{
		return (this.mat + this.sci + this.eng) / 3;
	}
}
