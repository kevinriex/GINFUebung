package Uebungen;

import static java.lang.System.out;

public class Uebung8 {
	public static void main(String[] args) {
		two();
	}

	public static void two() {
		out.println("\n\nErg: " + faq(5)); // Erg: 5! = 120
	}

	private static int faq(int x) {
		out.print(x + "\t");
		if (x > 1) {
			return x * faq(x - 1);
		}
		return x;
	}
}
