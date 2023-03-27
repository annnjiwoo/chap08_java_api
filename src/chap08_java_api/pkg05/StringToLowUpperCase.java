package chap08_java_api.pkg05;
/**
 * 영문 (대소문자) 변환
 */

public class StringToLowUpperCase {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		//String은 클래스라 참조 자료형
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		//equalsIgnoreCase 대소문자 구분 없이 비교
		//equalsIgnoreCase은 스트링타입
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
