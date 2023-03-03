package ch06.sec08.exercise;

public class MemberService {

	boolean login(String id, String password) {
//		if (id == "hong" && password == "12345") {
//			return true;
//		} else {
//			return false;
//		}
		return id.equals("hong") && password.equals("12345"); // 이렇게 간단히 리턴문을 작성해줘도 된다..
	}

	void logout(String id) {
		System.out.println(id + "님이 로그아웃되셨습니다. ");
	}

}
