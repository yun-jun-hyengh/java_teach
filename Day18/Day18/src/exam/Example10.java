package exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example10 {
	public static void main(String[] args) throws IOException {
		/*
		 * 문자 집합과 InputStreamReader를 이용하여 텍스트 파일 읽기 
		 * - InputStreamReader는 스트림에 입력되는 바이트 데이터를 
		 * 문자 집합을 통해 문자로 변환함 
		 * - InputStreamReader의 생성자에 문자 집합을 지정해야 한다 
		 * 만약 읽어들인 바이트들이 문자집합에 속하지 않는 경우 해독할 수 없는 
		 * 글자 출력 
		 */
		
		FileInputStream fin = new FileInputStream("c:/upload/한글문서.txt");
		InputStreamReader in = new InputStreamReader(fin, "UTF-8");
		int c;
		while((c = in.read()) != -1) {
			System.out.print((char) c);
		}
	}
}
