package com.board.util;

import java.util.Scanner;

public class ScannerUtil {
	public static Scanner sc = new Scanner(System.in);
	
	public static String nextLine(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }
	
	public static int nextInt(String message) {
		while (true) {
            System.out.print(message);
            try {
                int value = Integer.parseInt(sc.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요.");
            }
        }
	}
	
	public static void close() {
		sc.close();
	}
}
