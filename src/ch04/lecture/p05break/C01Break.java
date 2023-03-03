package ch04.lecture.p05break;

public class C01Break {

	public static void main(String[] args) {
		// break
		// 반복문 (for, while, do while) 종료
		
		while (true) {
			System.out.println("코드 반복 1");
			System.out.println("코드 반복 2");
			
			if(true) {
			break;
			}
			
			System.out.println("코드 반복 3");
			System.out.println("코드 반복 4");
			
		}
		System.out.println("다음실행 코드들");
	}

}
