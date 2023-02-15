package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C08Scanner {
	public static void main(String[] args) {
		// 백준 10950번
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 0 ; i < a ; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(x+y);
		}
	}
}
