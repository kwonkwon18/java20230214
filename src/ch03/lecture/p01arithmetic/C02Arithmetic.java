package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {

	public static void main(String[] args) {
		// 백준 2588번
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//3번자리
		System.out.println(a * ((b%100)%10));
		
		//4번자리
		System.out.println(a * ((b%100)/10));
		
		//5번자리
		System.out.println(a * (b/100));
		
		//6번자리
		System.out.println(a * b);

	}

}
