package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C04ArrayCopy {

	public static void main(String[] args) {
		// 책 188쪽

		int[] origin = { 9, 7, 6, 5, 4 };

		int[] target = new int[origin.length];

		// 파라미터 : 원본배열 - 원본배열 복사 시작인덱스 - 새배열 - 새배열 붙어넣기 시작 인덱스 - 복사 항목 수
		System.arraycopy(origin, 0, target, 0, origin.length);

		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(target));

	}

}
