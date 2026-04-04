package exam;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AESAlgorithm {
	public static SecretKey generateKey(String studentId, String name) {
        // 학번 10문자 + 이름 6문자 = 16문자
        String studentIdBinary = stringToBinary(studentId); // 학번을 이진수로 변환
        String nameBinary = stringToBinary(name);           // 이름을 이진수로 변환

        // 128비트(16바이트) AES 키 만들기
        String keyBinary = (studentIdBinary + nameBinary).substring(0, 128); // 128비트로 자름
        byte[] keyBytes = new byte[16]; // 128비트 = 16바이트
        for (int i = 0; i < 16; i++) {
            keyBytes[i] = (byte) Integer.parseInt(keyBinary.substring(i * 8, (i + 1) * 8), 2);
        }
        return new SecretKeySpec(keyBytes, "AES");
    }
	
	public static String stringToBinary(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            result.append(String.format("%8s", Integer.toBinaryString(c)).replaceAll(" ", "0"));
        }
        return result.toString();
    }
	
	public static void main(String[] args) {
		
	}
}
