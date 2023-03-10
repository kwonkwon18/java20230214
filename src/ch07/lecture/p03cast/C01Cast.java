package ch07.lecture.p03cast;

public class C01Cast {

	public static void main(String[] args) {

		// 자식객체에서 부모타입으로 형변환 하였을 때,
		// 자식객체에서 사용하고 싶은 메서드가 있을 때 강제 형변환 (type casting)을 진행

		Animal a1 = new Horse();
		a1.breath();

		// 자식타입 변수가 부모타입으로 형변환된 a1 을 다시 자식타입 변수로 바꾸고 싶을 때,
		// 자식타입   변수   =   (자식타입)   부모타입객체; 
		Horse h1 = (Horse) a1; // 강제 형변환(type casting)
		h1.run();

//		a1.run() xx ==> animal 클래스에 run 은 없음

		Animal a2 = new Fish();
		a2.breath();
		
		// 자식타입 변수가 부모타입으로 형변환된 a2 를 다시 자식타입 변수로 바꾸고 싶을 때,
		// 자식타입   변수   =   (자식타입)   부모타입객체; 
		Fish f1 = (Fish) a2; // 강제 형변환(type casting)
		f1.swim();

//		a2.swim():  xx  ==> animal 클래스에 swim 은 없음

	}
}

class Fish extends Animal {
	@Override
	public void breath() {
		System.out.println("아가미 호흡한다. ");
	}

	public void swim() {
		System.out.println("헤엄치다. ");
	}
}

class Horse extends Animal {
	@Override
	public void breath() {
		System.out.println("폐 호흡한다. ");
	}

	public void run() {
		System.out.println("달리다");
	}

}

class Animal {
	public void breath() {
		System.out.println("호흡한다. ");
	}
}
