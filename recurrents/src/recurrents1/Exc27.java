package recurrents1;

import java.util.Scanner;

public class Exc27 {

	public static void main(String[] args) {
				
 hello();
 System.out.println("Podaj rok swoich narodzin przybyszu...");
 Scanner sc = new Scanner(System.in);
 int useryear = sc.nextInt();
 //System.out.println(userage);
 if (useryear >= 1990 & useryear < 2020) {
 year(useryear);
 }
 else {
	 System.out.println("B�dzmy szczerzy przybyszu, szczero�� to cnota...");
	 mainn(args);
 }
	}
	
public static void mainn(String[] args) {
		
		
		 System.out.println("Podaj prawdziwy rok swoich narodzin przybyszu...");
		 Scanner sc = new Scanner(System.in);
		 int useryear = sc.nextInt();
		 //System.out.println(userage);
		 if (useryear >= 1990 & useryear < 2020) {
		 year(useryear);
		 }
		 else {
			 System.out.println("B�dzmy szczerzy przybyszu, szczero�� to cnota...");
			 mainn(args);
		 }
			}
	
	public static void hello() {
		
		System.out.println("Witaj");
		
	}
		
	public static void year(int useryear) {
		
		System.out.println("Wi�c pojawi�e� si� na tym �wiecie przybyszu w roku " + useryear + "...");
		
	}
	
	}
