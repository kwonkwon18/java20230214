package ch07.lecture.p04abstract;

// 추상클래스
// 이 클래스로 인스턴스를 만들 수 없음 

public abstract class Animal {

	public void see() {
		System.out.println("눈으로 봅니다.");
	}

	// 추상메서드
	// 몸통(body) 가 없는 메서드
	// 리턴 타입 앞에 abstract 붙이기
	// 추상메서드가 있으면 그 클래스는 추상클래스 이어야 함.
	// 상속받는 클래스에서 꼭 재정의 해야함 (오버라이딩)
	// 만약 추상메서드를 재정의 해주지 않으면 동작이 안됨,
	public abstract void breath();

}
