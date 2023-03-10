package ch12.lecture.p01object;

import java.util.HashSet;
import java.util.Set;

public class C21HashCodeEquals {

	public static void main(String[] args) {
		// 중복 없는 원소의 모임(Collection)
		Set set = new HashSet();

		set.add(100);
		System.out.println(set.size()); // 1

		set.add(200);
		System.out.println(set.size()); // 2

		set.add(100);
		System.out.println(set.size()); // 2 ==> 중복을 허용하지 않음, 존재하지 않으면 추가함

	}

}
