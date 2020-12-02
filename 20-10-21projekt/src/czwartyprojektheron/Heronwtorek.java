package czwartyprojektheron;

import java.util.Scanner;

public class Heronwtorek {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Jak dlugie a?");
		 double a = scan.nextDouble();
		 
		Scanner scann = new Scanner(System.in);
		 System.out.println("Jak dlugie b?");
		 double b = scann.nextDouble();
		 
		Scanner scannn = new Scanner(System.in);
		 System.out.println("Jak dlugie c?");
		 double c = scannn.nextDouble();
		 
		 if (a+b>c) { 
			 double p = ((a + b + c) /2);
			 double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			 
			 System.out.print("Trojkat o podanych bokach ma pole " + area);
		 }
		 else {
			 System.out.print("Taki trojkat nie istnieje");
		 }

	}

}
