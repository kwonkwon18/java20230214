package ch07.lecture.p02polymorphism;

public class C06Polymorphism {
	public static void main(String[] args) {

	}

	public static Gun getGun() {
		/// ...

		return new Gun();
	}

	public static Bow getBow() {
		// ....
		Bow b = new Bow();
		return b; // 리턴키워드를 만났을 때, 오른쪽이 Bow 타입이어야함
	}

	public static Weapon getWeapon() {
//		///...
//		Weapon w1 = new Weapon();
//		return w1;

//		Gun gun = new Gun();
//		return gun; // OOOO Gun 이 Weapon 을 상속받은 클래스기 때문에 리턴 가능함.

		Bow bow = new Bow();
		return bow; // ==> 이것도 Weapon을 상속받는 것이라 가능함.

	}
}
