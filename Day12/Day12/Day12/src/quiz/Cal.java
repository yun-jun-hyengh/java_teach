package quiz;

public class Cal {
	public int a;
	public int b;
	
	public int calculate(int a, int b, char opt){
		int result = 0;
		switch(opt) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		}
		return result;
	}
}
