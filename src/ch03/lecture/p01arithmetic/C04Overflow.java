package ch03.lecture.p01arithmetic;

public class C04Overflow {

	public static void main(String[] args) {
		int a = 15_0000_0000; // 15억
		int b = 17_0000_0000; // 17억

		System.out.println(a);
		System.out.println(b);

		// overflow : 타입의 최대허용값 벗어남
		int c = a + b;
		System.out.println(c); // -1094967296가 나옴.. 최대 표현할 수 있는 범위를 벗어남

		int d = -15_0000_0000;
		int e = -17_0000_0000;

		int f = d + e;
		System.out.println(f); // 1094967296 : 최소 표현할 수 있는 범위를 벗어남

		// 언더플로우 오버플로우는 연산할 때 일어난다.

	}

}
