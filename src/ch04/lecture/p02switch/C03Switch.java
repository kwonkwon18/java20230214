package ch04.lecture.p02switch;

public class C03Switch {

	public static void main(String[] args) {
		// switch 에서 사용가능한 값
		// byte, short, int, long, char, String, enum, charactor, Byte, Short, Integer
		// etc...

		char grade = 'a';

		switch (grade) {
		case 'A': //대문자 ==>  만약 소문자 a를 입력했다면, A는 패스하고 소문자 a로 간다. 그리고 둘다 포괄할 수 있는 
		case 'a': //소문자 //case 문에 들어간다. 
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다. ");
		}

	}

}
