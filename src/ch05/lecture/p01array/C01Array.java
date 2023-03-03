package ch05.lecture.p01array;

public class C01Array {
	public static void main(String[] args) {
		// array(배열)
		// 여러 값을 가진 자료형(data type)
		// 값의 순서가 있음
		// 0번부터 순서대로 매겨짐

		int a; // 기본 타입
		a = 3;

		int[] arr1; // 배열타입(각 값(원소, 아이템)의 타입이 int)
		arr1 = new int[3]; // 아이템의 수 정의

		arr1[0] = 3;
		arr1[1] = 5;
		arr1[2] = 10;

		a = arr1[0];
		System.out.println(a);
		System.out.println(arr1[2]);

		arr1[0] = 99;

		System.out.println(a); // 3, 변수의 참조 주소가 바뀌지 않았으므로 a는 그대로 3이다.
		System.out.println(arr1[0]); // 99

		// for와 궁합이 잘 맞는 자료형
		int[] arr2;
		arr2 = new int[4];

		arr2[0] = 99;
		arr2[1] = 100;
		arr2[2] = 200;
		arr2[3] = 300;

		System.out.println(arr2[0]); // 99
		System.out.println(arr2[1]); // 100
		System.out.println(arr2[2]); // 200
		System.out.println(arr2[3]); // 300 -==> 반복됨
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(arr2[i]); // ==> 위와 같은 결과
		}
		
		

	}
}
