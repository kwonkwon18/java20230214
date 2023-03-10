package ch07.lecture.p02polymorphism;

public class C09Polymorphism {
	public static void main(String[] args) {
		Weapon o1 = new Gun();
		Weapon o2 = new Bow();
		Weapon o3 = new Sword();

		Gun[] o4 = new Gun[3];
		o4[0] = new Gun();
		o4[1] = new Gun();
		o4[2] = new Gun();

		// 형태를 보자
		// Weapon 배열 안에 Weapon 을 상속받은 객체들이 들어갈 수 있고
		// 그 객체별로 Weapon 의 메서드를 오버라이딩한 메서드 사용이 가능하다.
		Weapon[] o5 = new Weapon[5];
		o5[0] = new Weapon();
		o5[1] = new Gun();
		o5[2] = new Bow();
		o5[3] = new Sword();

		o5[0].attack(); // 공격합니다
		o5[1].attack(); // 총으로 공격합니다
		o5[2].attack(); // 활을 쏩니다
		o5[3].attack(); // 칼로 공격합니다.

	}

}
