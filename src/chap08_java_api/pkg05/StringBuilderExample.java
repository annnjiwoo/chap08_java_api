package chap08_java_api.pkg05;

public class StringBuilderExample {
	public static void main(String[] args) {
		//StringBuilder
		
		StringBuilder sb = new StringBuilder("Hello");
		//StringBuilder는 내부 버퍼가 있으면서 문자를 이어붙이면서 수정한다
		// 한 객체 내에서 수정하며 이어붙인다.
		sb.append("World");
		sb.append("Ha Ha");
		System.out.println(sb);	// prints "Hello World Ha Ha"
		System.out.println();
		
		//String 차이점
		String data = "ABC";
		data += "def";
		System.out.println(data);	// ABCdef
	}

}
