package ch05.sec07;

public class example_8 {

	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		int total = 0;
		double avg = 0;
		int number = 0;

		for (int i = 0; i < array.length; i++) {
//			number += array[i].length; // 길이를 더해주자.  <== 이런 방법도 있음
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j]; // 각각 배열의 값을 더해주자ㅁ
				number++; // ==> 인원 숫자만큼 결국 for 문은 돌아가기 때문
			}

		}
		avg = (double) total / number;
		System.out.println(total); // 881
		System.out.println(avg); //88.1

		// 향상된 for 문
		// 전체 합
		int sum = 0;
		int total1 = 0;
		for (int[] n : array) {
			total1 += n.length;
			for (int a : n) {
				sum += a;

			}
		}
//		System.out.println(total1);
		System.out.println(sum);
		double avg1 = (double) sum / total1;
		System.out.println(avg1);
	}

}
