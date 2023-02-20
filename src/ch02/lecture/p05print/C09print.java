package ch02.lecture.p05print;

public class C09print {

	public static void main(String[] args) {
		//width 출력할 때 차지할 문자칸 수
		
		System.out.printf("%d%n", 300);
		
		
		System.out.printf("%5d%n", 300); // 5칸을 차지하게끔 컨텐트를 출력한다. 
		
		System.out.printf("%6d%n", 300); // 6칸을 차지하게끔 컨텐트를 출력한다.

		System.out.printf("%6s%n", "hi"); // 6칸을 차지하게끔 컨텐트를 출력한다.
		System.out.printf("%6s%n", "hello world"); // 컨텐트가 6칸이 넘으므로 무시하고 처음부터 출력해준다. 
		System.out.printf("%6d%n", 999888777); // 컨텐트가 6칸이 넘으므로 무시하고 처음부터 출력해준다. 
		
		int age = 29;
		String name = "son";
		
		System.out.printf("나이는 %2$3d이고, 이름은 %1$10s입니다", name, age); // index, width를 넣어서 출력해봄 ^^
		
	}

}
