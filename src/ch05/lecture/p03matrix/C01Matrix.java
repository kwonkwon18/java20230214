package ch05.lecture.p03matrix;

public class C01Matrix {

	public static void main(String[] args) {
		// 2차원 배열(행렬)
		// 배열을 가지고 있는 배열..(2차원적)

		int[][] arr = new int[3][]; // 앞을 행 , 뒤를 열 로 생각

		System.out.println(arr.length); // 3

		arr[0] = new int[] { 1, 3, 5, 4 };
		arr[1] = new int[] { 2, 3, 8, 10 };
		arr[2] = new int[] { 9, 10, 11, 18, 65 };
		System.out.println();
		System.out.println(arr[0][0]); // 1행 1열
		System.out.println();
		System.out.println(arr[1][1]);
		System.out.println();
		System.out.println(arr[2][3]);

		System.out.println("전체탐색");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) { // 각 행의 길이를 해줘야하므로 arr[i] 이게 되야함.
				System.out.println(arr[i][j]);
			}

		}

	}
}
