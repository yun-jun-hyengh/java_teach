package exam;

public class Example36 {
	
	public static boolean solution(String s) {
		int cnt1 = 0;
		int cnt2 = 0;
		boolean answer = true;
		for(char c : s.toCharArray()) {
			if(c == 'p' || c == 'P') {
				cnt1++;
			} else if(c == 'y' || c == 'Y') {
				cnt2++;
			}
		}
		if(cnt1 != cnt2) {
			answer = false;
		} else {
			answer = true;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY")); // true
        System.out.println(solution("Pyy"));     // false
	}
}
