package ch09.sec07.exam01;

public class Car {
	// 필드에 Tire 객체 대입
	private Tire tire1 = new Tire();

	// 타이어 2는 같은 메서드를 다르게 쓰고 싶어, 근데 여기만 쓸거라 추상클래스는 안만들래 
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 tire 객체 1 이 굴러갑니다");
		}
	};

	// 메서드(필드 이용)
	public void run1() {
		tire1.roll();
		tire2.roll();
	}

	// 메서드(로컬변수 이용)
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 trie 객체 2가 굴러갑니다. ");
			}
		};
		tire.roll();
	}

	public void run3(Tire tire) {
		tire.roll();
	}

}
