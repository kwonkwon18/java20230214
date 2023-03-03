package ch05.lecture.p02reference;

public class C05Reference {

	public static void main(String[] args) {
		
		// new = 오른쪽의 값이 들어갈 공간을 할당하다. 
		
		int arr[] = { 2, 4, 6 };

		int arr2[] = arr;

		System.out.println(arr2[0]); // 2

		arr = new int[] { 222, 444, 555 }; // 새로운 공간에 할당하였음

		System.out.println(arr[0]); // 222
		arr[0] = 20;
		System.out.println(arr[0]); // 20
		System.out.println(arr2[0]); // 2

	}

}
