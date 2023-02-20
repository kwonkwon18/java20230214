package ch03.lecture.p04Logical;

public class C03ShortCircuit {

	public static void main(String[] args) {
		
		// 연산결과가 항들의 끝까지 가지 않아도 결정되는 경우들 
		// & 하나만 하게 되면 shortcirculit 이 진행되지 않음(끝까지 다 연산해버림) 
		
		// &&
		// true && true : true
		// True && false = false
		// false && true = false
		// false && false = false

		int x = 10;
		if ((x++ > 0) && (x++ < 100)) { //true and true // 앞이 true 인 걸로는 true false 구분을 못해서 뒤까지 연산함
			// 뒤가 연산 됐는지 확인하기 위해서 증감 연산자 해줌
			System.out.println("실행됨");
		}System.out.println(x); // 증감연산다 두개 항 모두 진행됨
		
		x = 10;
		if((x-- > 100) && ( x-- < 200) ) {
			System.out.println("실행됨2"); //false
		}
		System.out.println(x); // 뒤에 항은 계산되지 않음, 첫 항에서 결정됨
		
		x = 10;
		if((x > 100) && (x++ < 0)) { 
			System.out.println("실행됨3");
		}
		System.out.println(x); // 뒤에 행 실행되지 않음
	}

}
