package ch07.lecture.p08super;

public class C01Super {
	
	public static void main(String[] args) {
		
		Sub01 o1 = new Sub01();
		
		
	}

}

class Super01{
	// 이 클래스로 인스턴스 만들 때 해야하는 일(순서 1)
	
	
}

class Sub01 extends Super01{
	// 이 클래스로 인스턴스 만들 때 해야하는 일(순서 2)
	Sub01(){
		// 상위클래스 생성자 호출 코드
		super(); // 꼭 먼저해야함, 위에 다른 코드 오면 안됨
		
	}
	
}