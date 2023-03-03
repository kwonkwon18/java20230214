package ch05.lecture.p06for;

public class C01EnhancedFor {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		// enhanced for (향상된 for), foreach
		for (int n : arr1) { // n 에 배열의 구성요소가 하나씩 들어간다, 인덱스별로
			System.out.println(n);
		}
		
		int max1 = 0;
		for(int n : arr1) {
			if(max1 < n) {
				max1 = n;
			}
		}
		System.out.println(max1); // 8 
		// 최대값이 있는 index
		
		int max = Integer.MIN_VALUE;
		int indexOfMax = 0 ; 
		for(int i = 0 ; i < arr1.length ; i++) {
			if(max < arr1[i]) {
				max = arr1[i];
				indexOfMax = i;
			}
		}
		System.out.println(indexOfMax);
		

	}

}
