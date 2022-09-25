package javaVariables;

public class trainTheTrainer {
	public static void main (String[] args) {

		String myStr = "Hello";

		System.out.println(myStr.startsWith("Hel")); // true

		System.out.println(myStr.startsWith("llo")); // false

		System.out.println(myStr.startsWith("o")); // false
		
		System.out.println(myStr.endsWith("Hel")); // false

		System.out.println(myStr.endsWith("llo")); // true

		System.out.println(myStr.endsWith("o")); // true

}
}
