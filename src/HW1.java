import java.util.Scanner;


public class HW1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Radius:");
		Scanner input = new Scanner(System.in);
		double radius = input.nextInt();
		double circumference = 3.14 * radius * 2;
		System.out.println("Circumference: "+ circumference);	
		
		
	}

}
