package exma;

import java.io.File;
import java.io.IOException;

public class Example01 {
	/*
	 * File 클래스 
	 * - File 클래스는 입출력에 필요한 파일 및 디렉토리에 관한 정보를 다룰 수 있다
	 * - File 클래스는 새로운 파일과 디렉토리 생성 및 삭제, 이름 변경 등의 조작
	 * 메소드를 가지고 있다.
	 */
	public static void main(String[] args) {
		File file = new File("C:\\upload\\test.txt");
		if(file.exists()) {
			try {
				// 파일 이름을 표시 
				System.out.println("getName : " + file.getName());
				// 파일 경로를 표시 
				System.out.println("getPath : " + file.getPath());
				// 파일 절대 경로를 표시 
				System.out.println("getAbsolutePath : " + file.getAbsolutePath());
				// 상위 디렉토리를 표시한다 
				System.out.println("getParent : " + file.getParent());
				
				// 파일 쓰기 권한체크
				if(file.canWrite()) {
					System.out.println(file.getName() + " 쓰기가능 ");
				}
				// 파일 읽기 권한체크 
				if(file.canRead()) {
					System.out.println(file.getName() + " 읽기가능 ");
				}
				
				// 파일인지 디렉토리인지 검사 
				if(file.isFile()) {
					System.out.println(file.getName() + " is file ");
				}
				
				if(file.isDirectory()) {
					System.out.println(file.getName() + " is directory ");
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
