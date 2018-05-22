import java.util.Scanner;


public class HW1e {
	public static void main(String[] args) {
		System.out.println("Enter weight in pounds:");
		Scanner weight = new Scanner(System.in);
		double input5 = weight.nextDouble();
		System.out.println("Enter height in inches:");
		Scanner input = new Scanner(System.in);
		double c = input.nextDouble();
		double BMI = 703 * (input5 / (Math.pow(c, 2)));
		int precision = 10;
		BMI= Math.floor(BMI*10 +.5)/precision;
		System.out.println("BMI is " + BMI);
	}

}
