package exam;
import java.util.*;

public class CpuTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 프로세스 개수 입력
        int n = sc.nextInt();
        List<Queue<Integer>> processes = new ArrayList<>();

        // 각 프로세스의 작업 목록 입력
        for (int i = 0; i < n; i++) {
            Queue<Integer> tasks = new LinkedList<>();
            while (true) {
                int t = sc.nextInt();
                if (t == -1) break;
                tasks.add(t);
            }
            processes.add(tasks);
        }
    }

}
