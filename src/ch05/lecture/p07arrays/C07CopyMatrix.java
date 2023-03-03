package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C07CopyMatrix {

	public static void main(String[] args) {
		
		int arr1[][] = {
				{5,6,7,10},
				{1,2,5,11}
		};
		
		int arr2[][] = new int[arr1.length][];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr2[i] = Arrays.copyOf(arr1[i], arr1[i].length);
		}
		
		System.out.println(Arrays.toString(arr1[0])); //[5, 6, 7, 10]
		System.out.println(Arrays.toString(arr1[1])); //[1, 2, 5, 11]
		

		System.out.println(Arrays.toString(arr2[0])); //[5, 6, 7, 10]
		System.out.println(Arrays.toString(arr2[1])); //[1, 2, 5, 11]
		
	}

}
