package scanfileone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileone {

	public static void main(String[] args) {
		
		//obliczanie sumy liczby obywateli 16 wojewodztw wyemigrowalych w 2019 roku do Luksemburga z Polski
		//obliczanie sredniej -|-

		File plik = new File("C:\\Users\\pacze\\Desktop\\inluksemburg.txt");
		try {

		Scanner sc = new Scanner(plik);
			int liczba;
			int suma = 0;

			while(sc.hasNextInt())
            {	
            	liczba = sc.nextInt();
            	suma = suma + liczba;
		    }
			System.out.print("Suma tych emigrantow to " + suma + ", srednia na wojewodztwo zas to " + suma / 16.);
			
	} catch (FileNotFoundException e) { e.printStackTrace();; }

}
}