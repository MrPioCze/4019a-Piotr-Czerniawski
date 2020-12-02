package szostyprojekt;

import java.util.Scanner;

public class zadansko {

	public static void main(String[] args) {
		

		double a = 1;
	    double b = 1;
		double c = 1;
		int licznik = 0;
		double suma = 0;
		double pole;
		if (licznik <=1) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("Podej liczbe a");
			  a = sc.nextDouble();
			  suma = suma + a;
			  licznik = licznik + 1;
		}
		if (a>0) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("Podej liczbe b");
			  b = sc.nextInt();
			  suma = suma + b;
			  licznik = licznik + 1;
		}
		else {
			System.out.println("Bok musi byc dodatni");
		}
		if (a>0 & b>0) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("Podej liczbe c");
			 c = sc.nextInt();
			 suma = suma + c;
			 licznik = licznik + 1;
		}
			 else {
				 System.out.println("Bok musi byc dodatni");
			 }
			 
		if (a+b>c & a+c>b & c+b>a) {
			pole = Math.sqrt(suma/2 * (suma - a) * (suma - b) * (suma - c));
			System.out.println("Trojkat o tych bokach ma pole " + pole);
		}
		else {
			System.out.println("Bok musi byc dodatni");
		}
	}

}
