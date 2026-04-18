package exam;

import java.util.HashMap;
import java.util.Map;

public class Quiz3 {
	public static void main(String[] args) {
		/*
		 * 주머니에는 파란색, 빨간색, 검은색 공이 모두 10개 들어있다. 각각의 색깔이 지닌 공이 몇개씩 들어있는지
		 * Map 컬렉션을 사용하여 출력하세요 
		 * 
		 * 실행결과)
		 * 빨간색 : 4개
		 * 파란색 : 3개
		 * 검은색 : 3개
		 */
		String[] balls = {"빨간색", "파란색", "검은색", "검은색", "빨간색", "파란색",
				"빨간색", "빨간색", "파란색", "검은색"};
		Map<String, Integer> map = new HashMap<>();
		
		for(String ball : balls) {
			if(map.containsKey(ball)) {
				int cnt = map.get(ball);
				cnt++;
				map.put(ball, cnt);
			} else {
				map.put(ball, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue() + "개");
		}
	}
}

