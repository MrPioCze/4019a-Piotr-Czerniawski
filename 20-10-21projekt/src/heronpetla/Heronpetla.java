package heronpetla;

import java.util.Scanner;

public class Heronpetla {

	public static void main(String[] args) {

	int a;
	double sum = 0;
	int count = 0;
	double avg = 0;
		
	while (count >= 0) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter number a");
	       a = sc.nextInt();
	       
	    if (a <0 || a > 0) {
			 sum = sum + a;
			 count = count + 1;
			 avg = sum/count;
		}	
		else {
			System.out.println("Average equals " + avg + " , time to continue ...");
		}
		
		
	}

	}
}
