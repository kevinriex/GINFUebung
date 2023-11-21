package Uebungen;
import java.util.Scanner;
import static java.lang.System.out;

public class Uebung6 {
	private static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		one();
		two();
		three();
	}
	public static void one() {
		out.println("##### BMI Calculator #####");
		
		out.print("Please input your mass(kg): ");
		double mass = Double.parseDouble(scn.nextLine());
		out.print("Please input your height(cm): ");
		double height = Double.parseDouble(scn.nextLine());
		
		double bmi = mass / Math.pow((height/100),2);
		
		out.println("Your BMI is: " + (Math.round(bmi * 100.00) / 100.00));
		
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public static void two() {
		out.println("##### Regex Replace #####");
		
		String input="Als Gregor Samsa eines Morgens aus unruhigen Traeumen erwachte,\nfand er sich in seinem Bett zu einem ungeheueren Ungeziefer verwandelt.";
		String output= input.replaceAll("a|e|i|o|u", "");
		
		out.println(output);
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	public static void three() {
		out.println("##### Name Inputter #####");
		
		out.print("Please enter your name (lastname, firstname): ");
		String name = scn.nextLine();
		
		String firstname = name.substring(name.indexOf(",") + 2,name.length());
		String lastname = name.substring(0,name.indexOf(","));
		
		out.println(String.format("Name: %s\nFirstname: %s",lastname, firstname));
		
		out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
