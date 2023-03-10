package ch07.lecture.p03cast;

public class C07Instance {

	public static void main(String[] args) {
		action(new Animal());
//		호흡한다. 
//		말도 아니고 물고기도 아니다. 

		action(new Horse());
//		폐 호흡한다. 
//		달리다

		action(new Fish());
//		아가미 호흡한다. 
//		헤엄치다. 

	}

	public static void action(Animal a) {
		a.breath();

		// 말이면 run
		if (a instanceof Horse) {
			Horse h = (Horse) a;
			h.run();
		} else if (a instanceof Fish) {
			Fish f = (Fish) a;
			f.swim();
		} else {
			System.out.println("말도 아니고 물고기도 아니다. ");
		}

		// 물고기면 swim
	}
}