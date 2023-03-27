package chap08_java_api.pkg02;
/**
 * Member 클래스의 객체의 값을 비교하는 실행클래스
 */

public class EqualsExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");	// new 객체로 생성할 경우는 무조건 새로운 객체로 만들어짐
		Member obj2 = new Member("blue");	//	obj1 과 obj2는 다름
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다..");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1과 obj3는 동등하지 않습니다..");
		}
	}

}
