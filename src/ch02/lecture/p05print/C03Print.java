package ch02.lecture.p05print;

public class C03Print {

	public static void main(String[] args) {
		//printf 
		//형식에 맞춰서 출력

		// 첫번째 파라미터(형식), 두번째 파라미터 (출력할 값)
		
		
		
		System.out.printf("어떤 형식");
		System.out.printf("또 다른 형식"); // 줄을 바꿔주는 서식을 넣지 않았으므로 이어서 작성됨
		
		// %n = 새로운 줄
		System.out.printf("%n새로운 줄 포함 %n새줄에 출력됨");
		
		// \n : 새로운 줄
		System.out.println("역슬래시 사용 \n 새 줄?");
		
		// %d ==> 10진법 정수를 출력하기 위한 형식
		System.out.printf("10진법 정수 %d", 99); // 1번 파라미터에 내용 및 형식 2번 파라미터 형식 안에 들어갈 컨텐트
		System.out.printf("%n 또다른 정수 %d",100);
//		System.out.printf("%n 또다른 정수 %d","삼백); 출력 안됨, 정수 자리에 String 을 넣으려고 함
//		System.out.printf("%n 또다른 정수 %d","3000"); 얘도 출력안됨, 
//		System.out.printf("%n 또다른 정수 %d",3.14); 정수가 아니라 실수타입을 컨텐트로 하였기 때문에 출력 안됨
		
		// %f : 10진법 상수
		System.out.printf("%n 10진법 실수 %f", 3.14); //3.140000
		System.out.printf("%n 10진법 실수 %f", 9.999); //9.999000
//		System.out.printf("%n 10진법 실수 %f", 3); (주의)정수는 받아들이지 않음
//		System.out.printf("%n 10진법 실수 %f", "3.14)); 문자열도 받아들이지 않음
		
		// %s : 문자열
		System.out.printf("%n 문자열 %s", "hello");
		System.out.printf("%n 문자열 %s", "world");
		System.out.printf("%n 문자열 %s", 3.14); // 얘는 됨
		System.out.printf("%n 문자열 %s", 99); // 얘도 됨
		System.out.printf("%n 문자열 %s", 3.14+11); // 14.14 ==> 계산해서 출력해줌..
		
		System.out.printf("%n%s world", "hi");
		System.out.printf("%n%d 숫자", 999);
		System.out.printf("%n%f 실수", 3.14);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
