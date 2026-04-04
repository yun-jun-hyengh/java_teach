package exam;

public class Example31 {
	
	public static String[] solution(String[] names) {
		String[] answer = {};
		int groupsize = 5;
		int groupcnt = (int) Math.ceil((double) names.length / groupsize);
		answer = new String[groupcnt];
		for(int i = 0; i < answer.length; i++) {
			int index = i * groupsize;
			answer[i] = names[index];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String arr[] = {"nami", "ahri", "jayce", "garen", "ivern"
				, "vex", "jinx"};
		String[] output = solution(arr);
		for(String s : output) {
			System.out.println(s);
		}
	}
}
