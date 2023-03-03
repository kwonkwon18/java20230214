package ch04.sec05;

public class example1 {
	public static void main(String[] args) {
		// 1번
		
		/*
		 * 0
		 * 01
		 * 012
		 * 0123
		 * 01234
		 */
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(j + " ");
			}System.out.println();
		}
	}
}