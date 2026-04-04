package exam;

public class Example32 {
	
	public static String[] solution(String[] todo_list, boolean[] finished) {
		String[] answer = {};
		int count = 0;
		for(int i = 0; i < finished.length; i++) {
			if(!finished[i]) {
				count++;
			}
		}
		answer = new String[count];
		int idx = 0;
		for(int i = 0; i < todo_list.length; i++) {
			if(!finished[i]) {
				answer[idx++] = todo_list[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] arr1 = {"problem", "practice", "swim", "studygraph"};
		boolean[] arr2 = {true, false, true, false};
		String[] output = solution(arr1, arr2);
		for(String s : output) {
			System.out.println(s);
		}
	}
}
