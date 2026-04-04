package ex08;

public class Example13 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		
		System.out.println("행의 크기 : " + arr.length); // 행의 크기 
		System.out.println("열의 크기 : " + arr[0].length); // 각 행의 열크기 
		System.out.println("열의 크기 : " + arr[1].length); 
		
		
	}
}
