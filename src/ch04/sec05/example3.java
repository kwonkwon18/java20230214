package ch04.sec05;

public class example3 {
	public static void main(String[] args) {
		//3번
		
		/*
		 * 0
		 * 01
		 * 012
		 * 0123
		 * 01234
		 */
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = i ; j >= 0 ; j--) {
				System.out.print(j + " ");
			}System.out.println();
		}
	}
}