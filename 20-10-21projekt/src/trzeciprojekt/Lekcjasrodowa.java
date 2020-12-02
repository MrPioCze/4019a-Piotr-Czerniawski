package trzeciprojekt;

import java.util.Scanner;

public class Lekcjasrodowa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Ile mili?");
		 double x = scan.nextDouble();
		 
		 System.out.println(x + " mili to " + x*1.609344 + " kilmetrow");
		
	}

}
