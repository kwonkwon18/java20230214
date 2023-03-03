package ch04.sec05;

public class example2 {

	public static void main(String[] args) {
		// 2번
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}System.out.println();
		}
	}
}