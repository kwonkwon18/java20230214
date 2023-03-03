package ch05.lecture.p01array;

public class C07Array {

	public static void main(String[] args) {

		int a = 3; 
		
		int b; 
		
		b = a;
		
		System.out.println(a); // 3
		System.out.println(b); // 3

		a = 6;
		System.out.println(a); // 6
		System.out.println(b); // 3
		
		int[] arr1 = {5,6,7};
		int[] arr2;
		arr2 = arr1; // 원소가 변경되면 같이 변경됨
		
		System.out.println(arr1[0]); // 5
		System.out.println(arr2[0]); // 5
		
		arr1[0] = 50;
		System.out.println(arr1[0]); // 50
		System.out.println(arr2[0]); // 50!!
		
		arr2[0] = 100;
		System.out.println(arr1[0]); // 100
		System.out.println(arr2[0]); // 100
		
		// 단순히 arr2 = arr1 을 하게 되면, 배열의 주소를 같이 참조하게 되므로 
		// 원본 배열의 변화에 영향을 받게 된다. 
		// 복사된 배열의 변화도 마찬가지. 
		
		
		
		
	}

}
