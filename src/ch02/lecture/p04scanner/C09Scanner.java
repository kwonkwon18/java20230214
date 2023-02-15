package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C09Scanner {

	public static void main(String[] args) {
		// 백준 25304번
		
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int kind = sc.nextInt();
		int aa = 0;
		int sum = 0;
		
		for(int i = 0; i < kind; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			aa = a * b;
			sum = sum + aa;
		}if(total == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
