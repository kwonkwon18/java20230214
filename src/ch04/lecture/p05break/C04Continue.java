package ch04.lecture.p05break;

public class C04Continue {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 500 ; i++) {
			System.out.println("실행코드 1");
			
			if(false) {
			continue;
			}
			
			System.out.println("실행코드 2"); // 실행코드 1, 2가 각 500번씩 출력된다. 
			
		}

	}

}
