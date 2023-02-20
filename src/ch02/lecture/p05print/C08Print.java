package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	// 백준 11021번
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		String input = """
				5
				1 1
				2 3
				3 4
				9 8
				5 2
				""";
		
		Scanner sc = new Scanner(input);
		int loop = sc.nextInt();
		
		for(int i = 1 ; i <= loop ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("Case #%2$d: %1$d%n", a+b, i);
		}
		

	}

}
