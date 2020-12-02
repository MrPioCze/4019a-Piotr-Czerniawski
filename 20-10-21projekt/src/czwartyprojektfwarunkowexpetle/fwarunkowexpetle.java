package czwartyprojektfwarunkowexpetle;

import java.util.Scanner;

public class fwarunkowexpetle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Jakie a?");
		 int a = scan.nextInt();
		 
		Scanner scann = new Scanner(System.in);
		 System.out.println("Jakie b?");
		 int b = scann.nextInt();
		 
		Scanner scannn = new Scanner(System.in);
		 System.out.println("Jakie c?");
		 int c = scannn.nextInt();
		
		if (a>b&b>c) {
		 
			System.out.printf(c, b,  a);
		}
		else if (c>b&b>a) {
			
			System.out.print(a, b, c);
		}

}
