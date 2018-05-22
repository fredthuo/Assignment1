import java.util.Scanner;


public class Hw1d {
	public static void main(String[] args) {
		System.out.println("Enter a decimal number:");
		Scanner decimal = new Scanner(System.in);
		double input4 = decimal.nextDouble();
		System.out.println( new Float( Math.round(input4)) );
	}
}
