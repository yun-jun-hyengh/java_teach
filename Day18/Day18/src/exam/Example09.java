package exam;

import java.io.FileReader;

public class Example09 {
	public static void main(String[] args) {
		
		// FileReader를 이용하여 파일 읽기 
		FileReader fin = null;
		try {
			
			// 경로상에 텍스트문서.txt 파일을 열고 파일과 입력 바이트 스트림 객체 
			// fin을 연결 
			fin = new FileReader("C:/upload/텍스트문서.txt");
			int c;
			// 파일 끝까지 한 바이트씩 c에 읽어 들임 
			// 파일의 끝을 만나면 read()는 -1을 리턴한다.
			while((c = fin.read()) != -1) {
				// 바이트 c를 문자로 변환하여 화면에 출력 !! 
				System.out.print((char) c);
			}
			fin.close(); // 스트림 닫기 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
