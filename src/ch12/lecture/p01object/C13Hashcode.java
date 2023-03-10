package ch12.lecture.p01object;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C13Hashcode {

	public static void main(String[] args) {
		Object o1 = new MyClass13();
		Object o2 = new MyClass13();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		System.out.println(h1); // 603856241
		System.out.println(h2); // 682376643
		

	}

}
