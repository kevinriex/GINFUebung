package Uebungen;

import java.util.Scanner;
import static java.lang.System.out;

public class Uebung7 {
	private static Scanner scn = new Scanner(System.in);
	private static double radius = 8;
	public static void main(String[] args) {
		//one();
		//two();
		//three(5,3,-11);
		four();
	}
	public static void one() {
		out.println("##### Circle #####");
		
		double u = radius * 2 * Math.PI;
		double a = Math.PI * Math.pow(radius, 2);
		
		out.println("Area: "+ a + "\nCircumference: " + u);
	}
	public static void two() {
		int input = 967215;
//		out.println(input);
//		out.println(String.valueOf(Integer.toBinaryString(input)).length());
//		out.println(Integer.toBinaryString(input).substring(0,15));
//		short bInput = Short.parseShort(String.valueOf(Integer.parseInt(Integer.toBinaryString(input).substring(0,15),2)));
//		
		short bInput = (short)(input >> 16);
		out.println(Integer.toBinaryString(bInput));
		
	}
	public static void three(int a, int b, int c) {
		// ax^2+bx+c = 0
		out.println(String.valueOf(a) + ", " + String.valueOf(b) + ", " + String.valueOf(c));
		double formulaA = ((b * -1) + Math.sqrt(Math.pow(b, 2)-(4*a*c)))/ (2*a);
		double formulaB = ((b * -1) - Math.sqrt(Math.pow(b, 2)-(4*a*c)))/ (2*a);
		
		out.println("x1: " + formulaA);
		out.println("x2: " + formulaB);
		
	}
	public static void four() {
		out.println("Please enter your age: ");
		int age = Integer.parseInt(scn.nextLine());
		String message = "";
		
		if (age < 18) {
			message = "You are under age:(";
		}
			else if (age > 67) {
			message = "You are above working age :)";
			}
			else {
		message = "Thanks 4 your data!";
		}
		out.println(message);
	}
}
