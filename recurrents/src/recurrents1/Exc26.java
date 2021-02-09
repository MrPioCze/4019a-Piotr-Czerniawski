package recurrents1;

import java.util.Scanner;

public class Exc26 {

	public static void main(String[] args) {
				
 hello();
 System.out.println("Podaj wiek swój przybyszu...");
 Scanner sc = new Scanner(System.in);
 int userage = sc.nextInt();
 //System.out.println(userage);
 age(userage);
 		
	}
	public static void hello() {
		
		System.out.println("Witaj");
		
	}
		
	public static void age(int userage) {
		
		System.out.println("Wiêc wiek Twój przybyszu to " + userage + "...");
		
	}
	
	}

