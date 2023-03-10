package ch12.lecture.p03system;

public class C02System {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		for (long i = 0; i < 1_00000_0000; i++) {
			int r = 3 * 5;
		}

		long end = System.currentTimeMillis();
		
		long result = end - start;
		
		System.out.println(result);
	}

}
