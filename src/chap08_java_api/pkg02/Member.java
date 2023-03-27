package chap08_java_api.pkg02;

public class Member extends Object{
	public String id;
	
	public Member (String id) {
		this.id=id;
	}

		//최고 조상인 Object가 갖고 있는 equals 메소드 재정의함
		//동등 비교 : 객체가 달라고 내용이 같은지 비교함.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	// obj가 Member 타입인지 비교요청 = instanceof
			Member mem = (Member)obj;
			if (id.equals(mem.id)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
