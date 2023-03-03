package ch06.lecture.p07constructor;

public class MyClass04 {
	
	String model;
	int price; 
	
//	MyClass04(String modelparam, int priceparam){
//		model = modelparam;
//		price = priceparam;
//	}
	
	MyClass04(String model, int price){
		this.model = model;
		this.price = price;
	}
	
	
	void desc() {
		System.out.println("모델명 : " + model);
		System.out.println("가격 : " + price);
	}

}
