package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		// 객체 생성 시 주민등록번호와 이름 전달 , 여기서부터 생성자 객체가 시작됨
		Korean kor = new Korean("950118-1111111", "kwonkwon"); // Korean 객체 생성자가 실행됩니다.

		System.out.println(kor.nation);
		System.out.println(kor.ssn);
		System.out.println(kor.name);

//		kor.nation = "중국"; 파이널 필드이기 때문에 변경 불가 
//		kor.ssn = "010612-3333333"; 파이널 필드이기 때문에 변경 불가

		kor.name = "wonwon";

	}

}
