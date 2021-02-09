package recurrents1;

import java.util.Scanner;

public class Exc25 {

	public static void main(String[] args) {
				
 hello();
 System.out.println("Podaj swe imiê przybyszu...");
 Scanner sc = new Scanner(System.in);
 String username = sc.nextLine();
 //System.out.println(username);
 name(username);
 		
	}
	public static void hello() {
		
		System.out.println("Witaj");
		
	}
		
	public static void name(String username) {
		
		System.out.println("Witaj " + username + ".");
		
	}
	
	}
