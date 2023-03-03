package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C05Copy {

	public static void main(String[] args) {
		int arr1[] = { 3, 4, 5 };

		int arr2[] = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.toString(arr1)); // [3, 4, 5]
		System.out.println(Arrays.toString(arr2)); // [3, 4, 5]

		arr1[0] = 30;

		System.out.println(Arrays.toString(arr1)); // [30, 4, 5]
		System.out.println(Arrays.toString(arr2)); // [3, 4, 5]

		int[][] arr3 = {
				{ 3, 4, 5 },
				{ 9, 8, 7 }
		};

		int[][] arr4 = Arrays.copyOf(arr3, arr3.length);

		System.out.println(arr3.length);
		System.out.println(arr4.length);

		arr3[0][0] = 30;

		System.out.println(arr3[0][0]); // 30
		System.out.println(arr4[0][0]); // 30????
		// ====>> 일단 1차원 배열의 주소 객체는 다르다, 그러나 그 객체가 담고 있었던 2차원 배열의 주소값은 동일하게
		// 가져오기 때문에, arr1의 변화가 arr2에도 영향을 주는 것이다. 

	}

}
