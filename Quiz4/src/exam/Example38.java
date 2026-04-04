package exam;

public class Example38 {
	
	public static String[] solution(String[] strArr) {
		String[] answer = {};
		answer = new String[strArr.length];
		for(int i = 0; i < strArr.length; i++) {
			if(i % 2 == 0) {
				answer[i] = strArr[i].toLowerCase();
			} else {
				answer[i] = strArr[i].toUpperCase();
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] arr1 = {"AAA","BBB","CCC","DDD"};
		String[] arr2 = {"aBc", "AbC"};
//		String[] output = solution(arr);
//		for(String s : output) {
//			System.out.println(s);
//		}
		String[] result1 = solution(arr1);
		String[] result2 = solution(arr2);
		for(String s : result1) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(String s : result2) {
			System.out.print(s + " ");
		}
	}
}
