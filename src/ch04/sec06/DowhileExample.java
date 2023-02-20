package ch04.sec06;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요 ");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");

		Scanner sc = new Scanner(System.in);
		String inputString;

		do { // while 문의 시작에 항상 먼저 입력되고 시작
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString); 
		} while (!inputString.equals("q"));


		System.out.println();
		System.out.println("프로그램 종료");

	}

}
