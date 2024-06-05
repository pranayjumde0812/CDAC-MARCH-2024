package wrappers;

public class MyWrapper {

	public static void main(String[] args) {
		Float f = Float.valueOf(123.65f); // Boxing
		System.out.println(f);

		float f1 = f.floatValue(); // Un-Boxing
		System.out.println(f1);

		f = 1234.432f;
		System.out.println(f); // auto-boxing

		f++;// auto unboxing -> increment operation -> autoboxing
		System.out.println(f);
		f1 = f;

		System.out.println(f1); // auto unboxing

		System.out.println("=================================================");

	}

}
