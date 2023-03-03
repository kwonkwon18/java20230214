package ch05.lecture.p01array;

public class C06ArrayLength {

	public static void main(String[] args) {
		// 배열의 길이

		int[] arr1 = { 3, 4, 5, 9, 34, 5, 5, 5 };

		int len = arr1.length; // 배열의 길이 , 변수에 넣어서 사용해주면 좋음

		for (int i = 0; i < len; i++) {
			System.out.println(arr1[i]);
		}

	}

}
