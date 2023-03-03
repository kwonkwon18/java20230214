package ch07.sec07.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b; // A 가 B를 상속하므로 가능 A <= B
		A a2 = c; // A 가 C를 상속하므로 가능 A <= C
		A a3 = d; // A 가 상속하는 B 를 D가 상속 받으므로 가능 A <= B <= D
		A a4 = e; // A 가 상속하는 C 를 E가 상속 받으므로 가능 A <= C <= E

//		B b3 = e; 서로 관련이 없기 때문에 형변환 불가 
//		C c2 = d; 서로 관련이 없기 때문에 형변환 불가 

	}

}
