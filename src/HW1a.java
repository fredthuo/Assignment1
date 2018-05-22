import java.util.Scanner;


public class HW1a {

	public static void main(String[] args) {
		
		System.out.println("Enter base-width:");
		Scanner input1 = new Scanner(System.in);
		double baseWidth = input1.nextInt();
		System.out.println("Enter height:");
		int height = input1.nextInt();
		double Area = 0.5 * baseWidth * height;
		System.out.println("Area = "+ Area);


	}

}
