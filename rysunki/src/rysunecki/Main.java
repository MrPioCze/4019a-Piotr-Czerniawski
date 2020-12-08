package rysunecki;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		  int w = 2;
		  int e = 1; //promien
		  int suma = 0;
		  int total = 1000;

		  StdDraw.setCanvasSize(w, w);
		  StdDraw.setScale(-w / 2, w / 2);
          StdDraw.ellipse(0, 0, e, e);
          StdDraw.setPenRadius(0.05);
          
          Random r = new Random();
          for (int i = 0; i <= total; i++) {
        	  int x = r.nextInt(w) - w / 2;
        	  int y = r.nextInt(w) - w / 2;        	  
        	 if (x * x + y * y <= e * e) {
        		 StdDraw.setPenColor(StdDraw.DARK_GRAY);
        		 if ((x * x + y * y) <= e) { suma++;
                 }
        	 }
        	 else {
        		 StdDraw.setPenColor(StdDraw.CYAN);
        		 }
        	 StdDraw.point(x, y);
          }
        	double pi = 4. * suma / total;
        		System.out.println(pi);
        	 }
          } 
         
          
         

