import java.awt.event.InputEvent;
import java.util.Scanner;


public class HW1c {
	public static void main(String[] args) {

		
		System.out.println("Enter a letter of the alphabet:");
		Scanner in = new Scanner(System.in);
		char ch=in.next().charAt(0);
		//char c = in.next().charAt(0);
		/*int ascii = (int) c;
		System.out.println("The numerical value of the letter is: " + ascii);*/
		int x=ch;
		System.out.println(ch+" is:"+x);
		
	}
}
