package zaliczenie;

import java.util.Random;

public class ZaliczenieTablice {

	public static void main(String[] args) {
		// Piotr Czerniawski
		// zadanie g
		// wersja incl petla

		Random r = new Random();
		int[] g = new int[10];
		for (int i = 0; i<10; i++) {
		 g[i] = r.nextInt(60)+140;
		
		 System.out.println(g[i]);
	}
	}

}
