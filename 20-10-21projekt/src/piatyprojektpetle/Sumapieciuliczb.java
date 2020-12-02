package piatyprojektpetle;

import java.util.Scanner;

public class Sumapieciuliczb {

public static void main(String[] args) {
		
	    int a;
		int licznik = 1;
		int iloczyn = 0;
		while (licznik <= 5) {
			Scanner scan = new Scanner(System.in);
			 System.out.println("Podej liczbe a");
			  a = scan.nextInt();
			  iloczyn = iloczyn * a;
              licznik = licznik + 1;
          
	}
	 System.out.println("Iloczyn to" + iloczyn);
	 
}


	
}
