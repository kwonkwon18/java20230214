package ch07.lecture.p02polymorphism;

public class C08Polymorphism {

	public static void main(String[] args) {
		// 실제로는 인스턴스 (오른쪽) 의 메서드가 실행된다.
		// 참조변수는 어떤 것을 안정적으로 실행 시킬 수 있는지!
		Gun o1 = getGun();
		Weapon o2 = getGun();

		Weapon o3 = getBow();
		Weapon o4 = getSword();

		o2.attack(); // 총으로 공격합니다
		o3.attack(); // 활을 쏩니다
		o4.attack(); // 칼로 공격합니다.
	}

	public static Gun getGun() {
		return new Gun();
	}

	public static Bow getBow() {
		return new Bow();
	}

	public static Sword getSword() {
		return new Sword();
	}

}
