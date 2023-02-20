package ch03.lectrue.p02assignment;

public class C01Assignment {

	public static void main(String[] args) {
		// 할당 연산자
		// =. +=. -=, *=, /=, %=
		
		int x = 10;
		
		x += 30; // x = x + 30;
		System.out.println(x);

		x -= 20; // x = x -20;
		System.out.println(x);
		
		x *= 3; // x = x* 3
		System.out.println(x);
		
		x /= 7; // x = x / 7;
		System.out.println(x); // 8 , int 형이라서 소수점은 버린다. 
		
		x %= 3;
		System.out.println(x); // 2
	}

}
