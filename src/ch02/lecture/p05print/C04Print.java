package ch02.lecture.p05print;

public class C04Print {

	public static void main(String[] args) {
		// 아규먼트(%)는 순서대로 적용됨 
		System.out.printf("%d, %d %n", 3, 4); // 아규먼트가 두개면 파라미터도 두개 써주면 된다.
		
		System.out.printf("%d, %f%n",3,7.55);
		System.out.printf("%d %f %s %n",8,1.99,"권권");
	}

}
