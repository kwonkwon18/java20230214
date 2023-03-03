package ch05.lecture.p01array;

public class C03Array {

	public static void main(String[] args) {
		// 배열 만들고 값 할당
		int[] arr1 = new int[3];
		
		arr1[0] = 9; 
		arr1[1] = 7;
		arr1[2] = 5;
		
		// 배열 만들 때 초기값 생성
		int[] arr2 = new int[] {99, 88, 77}; // 원소의 갯수가 길이가 됨
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		// for를 통해서 값을 확인해주는 법, 할당하는 것도 응용 가능
		for(int i = 0 ; i < 3 ; i ++) {
			System.out.println(arr2[i]);
		}

	}

}
