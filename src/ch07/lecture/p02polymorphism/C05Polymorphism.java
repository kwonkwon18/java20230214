package ch07.lecture.p02polymorphism;

public class C05Polymorphism {
	public static void main(String[] args) {
		Hero hero = new Hero();

		hero.weapon = new Gun();
		hero.button1(); // 총으로 공격합니다

		hero.weapon = new Bow();
		hero.button1(); // 활을 쏩니다

		hero.weapon = new Sword();
		hero.button1(); // 칼로 공격합니다.

	}

}

class Hero {
	public Weapon weapon; // 필드의 인스턴스는 계속 바뀌지만 코드는 동일하다.

	public void button1() {
		weapon.attack();
	}
}

class Weapon {
	public void attack() {
		System.out.println("공격합니다");
	}
}

class Gun extends Weapon {
	@Override
	public void attack() {
		System.out.println("총으로 공격합니다 ");
	}
}

class Bow extends Weapon {
	@Override
	public void attack() {
		System.out.println("활을 쏩니다 ");
	}
}

class Sword extends Weapon {
	@Override
	public void attack() {
		System.out.println("칼로 공격합니다.  ");
	}
}
