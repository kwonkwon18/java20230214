package ch05.lecture.p01array;

public class C08ArrayCopy {

	public static void main(String[] args) {
		int[] arr1 = {3,4,5};
		
		int[] arr2 = {10,20,30};
		int[] arr3 = new int[arr2.length]; // 길이가 같아야함
		
		for(int i = 0 ; i < arr2.length ; i++) {
			arr3[i] = arr2[i];
		}
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		
		arr2[0] = 100;
		
		System.out.println(arr2[0]); // 100
		System.out.println(arr3[0]); // 30
		
		//아에 다른 배열을 만들어서 복사한 것이므로, 원본 배열의 변화에 영향을 받지 않는다. 
	}

}
