package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) { // strVar1과 strVar2는 참조자 같음
			System.out.println("strVar1과 strVar2는 참조자 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조자 같지 않음");
		}
		
		if(strVar1.equals(strVar2)) { // strvar1과 strvar2 는 문자열이 같음
			System.out.println("strvar1과 strvar2 는 문자열이 같음");
		}
		
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if (strVar3 == strVar4) { // strVar3과 strVar4는 참조자 같지 않음
			System.out.println("strVar3과 strVar4는 참조자 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조자 같지 않음");
		}
		
		if(strVar3.equals(strVar4)) { // strvar3과 strvar4 는 문자열이 같음
			System.out.println("strvar3과 strvar4 는 문자열이 같음");
			
		}
	}

}
