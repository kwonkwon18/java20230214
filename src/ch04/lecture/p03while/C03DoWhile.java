package ch04.lecture.p03while;

public class C03DoWhile {

	public static void main(String[] args) {
		// do while
		// 코드블럭 실행 후 조건 확인
		// 조건이 true 이면 코드 블럭 실행
		
		System.out.println(" 이전 명령문 ");
		
		boolean con = false; // 명령문 반복1, 명령문 반복 2 1회 실행되는 것을 확인
//		boolean con = true; // 명령문 반복1, 명령문 반복 2 무한 루프되는 것 확인
		
		do {
			System.out.println("명령문 반복 1");
			System.out.println("명령문 반복 2");
		}while(con) ;
		
		System.out.println("다음명령문");

	}
	
}
