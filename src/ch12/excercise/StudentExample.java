package ch12.excercise;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		
		HashSet<Student> hashSet = new HashSet<>();
		
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		hashSet.add(new Student("1"));

		
		System.out.println(hashSet.size());
		// 3 ==> hashcode 와 equals 오버라이딩 전
		// 2 ==> hashcode 와 equals 오버라이딩 후
	}

}
