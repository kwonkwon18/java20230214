package ch03.lecture.p06string;

public class C09Trim {

	public static void main(String[] args) {
		// trim
		// 문자의 앞 뒤 공백을 제거
		// return type : Sting
		
		String str1 = "    my     spring    ";
		
		System.out.println(str1);
		
		String res1 = str1.trim(); 
		System.out.println(res1); // my     spring => 앞 뒤 공백은 사라졌다. 

	}

}