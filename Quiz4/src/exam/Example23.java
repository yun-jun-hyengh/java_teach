package exam;

import java.util.Arrays;

public class Example23 {
	public static void main(String[] args) {
		String str = "banana";
        int len = str.length();
        String[] suffixes = new String[len];

        for (int i = 0; i < len; i++) {
            suffixes[i] = str.substring(i);
        }

        Arrays.sort(suffixes); // 사전순 정렬

        for (String suffix : suffixes) {
            System.out.println(suffix);
        }
	}
}
