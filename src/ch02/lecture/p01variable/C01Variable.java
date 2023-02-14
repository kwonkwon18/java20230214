package ch02.lecture.p01variable;

public class C01Variable {
	public static void main(String[] args) {
		 
		// 변수
		// 값을 담을 수 있는 이름있는 공간
		
		// 변수 선언
		// 타입 변수염;
		int age;
		double average;
		
		// 변수명
		// 영문대소문자, _. $. 숫자 조합으로 작성 가능, 숫자로 시작하면 안됨
		// 변수명 작성 관습 : lowerCamelCase
		
		int $;
		int hello;
		int your_age;
		
//		int 3h; 숫자로 시작 불가 
		
		int yourAge ; // 관습에 따라 작성 (이 방법으로 서술하자)
		int 나이; // 가능한 사용하지 말 것
		
		// 변수를 여러개 선언가능
		int myAge, hisAge, herAge;
		
		// 같은 이름의 변수 선언 불가
		int hi;
//		int hi; 선언 불가
		
		// 변수에 값 대입(할당) : = 
		hi = 3;
		int var1;
		var1 = 99;
		
		int var2 = 100; // 변수 선언과 값 할당을 동시에 할 수 있다. 
		
		// 여러개 할 수 있다. 
		int var3 = 20, var4 = 40;
		
		// 값을 할당하지 않은 변수 사용 불가
		// 값을 초기화하지 않은 변수 사용 불가
		
		int var5;
//		System.out.println(var5); 초기화가 되어 있지 않아서 안됨
		
		// 변수 작성시 어떤 값을 갖는지 알아볼 수 있게
		int Koreanscore; //국어
		int Englich ; // 영어
		
		
	}
}
