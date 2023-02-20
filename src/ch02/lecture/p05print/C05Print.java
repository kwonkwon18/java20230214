package ch02.lecture.p05print;
import java.util.*;
public class C05Print {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수 :");
		int num1 = scanner.nextInt();
		
		
		System.out.print("두번째 수 :");
		int num2 = scanner.nextInt();

		int sum = num1 + num2;
		
//		System.out.println(num1 + " + " + num2 + " = " + sum); printf 가 아니면 이렇게 서술해야함 
		System.out.printf("%d + %d = %d%n",num1, num2, sum); // printf 를 사용하면 간결하게 처리 가능
		
	}

}
