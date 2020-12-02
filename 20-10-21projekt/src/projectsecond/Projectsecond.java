package projectsecond;

import java.util.Scanner;

public class Projectsecond {

	public static void main(String[] args) {

 int rokurodzenia = 2003;
 int danyrok = 2020;
 int s = danyrok - rokurodzenia;
 
 System.out.println("Mam " + s + " lat");
 
 double a, b, c, d, e;
 a=52;
 b=22;
 c=a + b;
 d=a*b/c;
 e=a/b;
 
 System.out.println("Matematyka jest prosta: " +c);
 System.out.println("Czasami trudniejsza: " +d);
 System.out.println("A jeszcze czasami ograniczona: " +e);
 
 Scanner sc;
 sc = new Scanner(System.in);
 
 double x = sc.nextDouble();
 double y = 22;
 double z = x + y;
 System.out.println("Suma x i y =" + z);
		
	}

}
