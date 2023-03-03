package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03CopyOf {

	public static void main(String[] args) {
		int arr1[] = { 3, 5, 7, 9 };

		// 파라미터 : 원본배열, 타겟배열길이
		int arr2[] = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.toString(arr1)); // [3, 5, 7, 9]
		System.out.println(Arrays.toString(arr2)); // [3, 5, 7, 9]

		// 복사된 값은 다른 주소 참조
		arr1[0] = 33;
		System.out.println(Arrays.toString(arr1)); // [33, 5, 7, 9]
		System.out.println(Arrays.toString(arr2)); // [3, 5, 7, 9]

		// 교재 188 페이지
		String oldStrArray[] = { "java", "array", "copy" };
		// 새로운 타입 배열 준비 = Arays.copyOf(복사할 배열, 배열길이};
		String newStrArray[] = Arrays.copyOf(oldStrArray, oldStrArray.length);

		System.out.println(Arrays.toString(oldStrArray)); // [java, array, copy]
		System.out.println(Arrays.toString(newStrArray)); // [java, array, copy]
	}

}
