package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); // String을 int 형으로 변환
		double value2 = Double.parseDouble("3.12323"); //String을 double 형으로 변환
		boolean value3 = Boolean.parseBoolean("true"); //String을 Boolean 형으로 변환
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String str1 = String.valueOf(10); // Stirng으로 변환
		String str2 = String.valueOf(3.14); // Stirng으로 변환
		
		System.out.println(str1 + str2);
	}
}
