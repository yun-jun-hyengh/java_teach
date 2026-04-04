package ex08;

public class Example10 {
	public static void main(String[] args) {
		/*
		 * 다차원 배열 
		 * - 1차원 배열과는 달리 행과 열로 구성된 배열을 2차원 배열이라 한다 
		 * - 2차원 배열 형태는 수학의 행렬과 동일한 형태 
		 * 
		 * 2(행) x 3(열) 
		 * int[][] array = new int[2][3];
		 */
		
		int [][] array = new int[2][3];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
			}
		}
	}
}
