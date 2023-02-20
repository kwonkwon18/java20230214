package ch02.lecture.p05print;

public class C10Print {

	public static void main(String[] args) {
		// flag
		// - : 왼쪽 정렬
		
		System.out.printf("%d%n", 33);
		System.out.printf("%5d%n", 33);
		System.out.printf("%-5d%n", 33); // 왼쪽 정렬, 5칸을 차지고 있다는 점에서 의미가 있음
		
		
		System.out.printf("%-10s입니다%n%n", "son"); // 왼쪽 정렬, 10칸을 차지고 있다는 점에서 의미가 있음
		
		//0 : 0 으로 채움 (수)
		System.out.printf("%d%n", 99);
		System.out.printf("%5d%n", 99);
		System.out.printf("%05d%n", 99); // 총 다섯칸 중, 비어있는 공간을 0으로 채움
		System.out.printf("%1$05d%n", 99); // 첫번째 컨텐트를 선택하고, 총 다섯칸 중 비어있는 공간을 0으로 채움
		
		System.out.printf("%010f%n", 3.44); // 003.440000 실수로 해본 것
		
		// precision : 소수점 이하 자릿수
		System.out.printf("%10.3f%n",3.14);// .3이 들어가면서 소수점 세자리 까지만 출력한다. 
		System.out.printf("%010.3f%n",3.55555);// .3이 들어가면서 소수점 세자리까지 보여주고 넷째자리에서 반올림. 
		
		
	}

}
