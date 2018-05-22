import java.util.Scanner;


public class HW1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner input2 = new Scanner(System.in);
		double number = input2.nextDouble();
		if  (number % 2 == 0){
			System.out.println("You have entered an Even Number");
		}
		else {
			System.out.println("You have entered an Odd Number");
		}
	}

}
