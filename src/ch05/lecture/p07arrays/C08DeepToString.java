package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {

	public static void main(String[] args) {
		int[] arr1 = { 5, 1, 2, 3, 4 };

		System.out.println(Arrays.toString(arr1));

		int[][] arr2 = {
				{ 1, 2, 4, 12 },
				{ 213, 424 }
		};

		System.out.println(arr2[0]); // [I@74a10858
		System.out.println(Arrays.toString(arr2)); // [[I@74a10858, [I@23fe1d71]

		System.out.println(" for loop 로 toString");
		for (int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));

		}

		System.out.println("deepToString 메소드 사용");
		System.out.println(Arrays.deepToString(arr2)); // [[1, 2, 4, 12], [213, 424]]
	}

}
