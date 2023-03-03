package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C01ToString {

// toString 은 배열을 보여주는 메서드이다. Arrays.toString()

	public static void main(String[] args) {
		int arr1[] = { 9, 7, 8, 1, 2 };

		for (int n : arr1) {
			System.out.println(n);
		}

		System.out.println(Arrays.toString(arr1)); // [9, 7, 8, 1, 2]

		String arr2[] = { "java", "hello", "friday" };
		System.out.println(Arrays.toString(arr2));
	}

}
