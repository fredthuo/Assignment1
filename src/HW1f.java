import java.util.Scanner;


public class HW1f {

	public static void main(String[] args) {
		System.out.println("Enter Investmment Amount:");
		Scanner investmentAmount = new Scanner(System.in);
		double input7 = investmentAmount.nextDouble();
		System.out.println("Enter monthly interest rate:");
		Scanner input = new Scanner(System.in);
		double input8 = input.nextDouble();
		System.out.println("Enter number of years:");
		Scanner input4 = new Scanner(System.in);
		double input9 = input4.nextDouble();
		double interestOne = 1 + ((input8/100) / 12);
		double interestTwo = Math.pow(interestOne, (12*input9));
		double finalInterest = input7 * interestTwo;
		int precisionOne = 100;
		finalInterest = Math.floor(finalInterest*100 +.5)/precisionOne;
		System.out.println("Interest = " +finalInterest);

	}

}
