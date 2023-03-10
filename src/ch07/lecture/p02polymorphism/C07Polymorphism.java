package ch07.lecture.p02polymorphism;

public class C07Polymorphism {
	public static void main(String[] args) {
		Hero hero = new Hero();
		// .. 진행.. 무기선택
		Weapon w = getWeapon(3); // w 에 어떤 객체를 넣어서 형변환 할지 선택

		hero.weapon = w; // waepon 필드를 해당 객체로 형변환

		hero.button1(); // 형변환하여 오버라이딩 한 메서드 호출
	}

	public static Weapon getWeapon(int choice) {
		switch (choice) {
		case 1 -> {
			return new Gun();
		}
		case 2 -> {
			return new Bow();
		}
		case 3 -> {
			return new Sword();
		}
		}
		return new Weapon(); // switch 에 디폴트 값
	}
}