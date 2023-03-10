package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();

		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 후 :" + hashSet.size()); // 저장된 객체 후 :1

		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 후 :" + hashSet.size()); // 저장된 객체 후 :1 ==> 같은 객체로 인식해 저장 안됨

		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 후 :" + hashSet.size()); // 저장된 객체 후 :2

	}

}
