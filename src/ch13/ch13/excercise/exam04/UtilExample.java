package ch13.ch13.excercise.exam04;

public class UtilExample {

	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age); .age. 35
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childage = Util.getValue(ChildPair, "홍삼순");
		System.out.println(childAge); // null

	}

}
