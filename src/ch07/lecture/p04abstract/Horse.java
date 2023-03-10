package ch07.lecture.p04abstract;

public class Horse extends Animal {

	// 추상메서드는 꼭 재정의 해줘야함 
	@Override
	public void breath() {
		System.out.println("폐 호흡을 합니다. ");
	}

}
