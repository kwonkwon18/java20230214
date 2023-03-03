package ch07.lecture.p01inheritance;

public class C07Polymorphism {
	public static void main(String[] args) {

		// 부모 타입과는 상관없이 자식객체를 따라감
		// Animal 은 리모컨 느낌임
		// Animal 의 다른 기능들을 같은 이름을 가진 메서드(오버라이딩)로 형변환해서 진행해줌
		// Animal 이라는 리모컨(사용하기 위해서 참조변수에 대입) Horse 방향으로(형변환) 작동(메서드) 해주면 리모컨에 있는 기능을
		// Horse 식으로 해준다.
		Animal a1 = new Horse();
		Animal a2 = new Fish();

		a1.breath(); // 폐로 호흡한다
		a2.breath(); // 아가미로 호흡한다
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다");

	}

}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐로 호흡한다");

	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다");
	}

}
