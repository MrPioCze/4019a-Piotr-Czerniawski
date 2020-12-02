package rysunecki;

import java.util.Random;

public class Main {

	  public static void main(String[] args) {
		  int w = 900; //30 * 30
		  int e = 144; //12 * 12 //promien
		  double pi;
		  int suma1 = 0;
		  int total = 50000;

		  StdDraw.setCanvasSize(w, w);
		  StdDraw.setScale(-w / 2, w / 2);
          StdDraw.ellipse(0, 0, e, e);
          StdDraw.setPenRadius(0.05);
          
          Random r = new Random();
          for (int i = 0; i <= total; i++) {
        	  int x = r.nextInt(w) - w / 2;
        	  int y = r.nextInt(w) - w / 2;        	  
        	 if (x * x + y * y < e * e) {
        		 StdDraw.setPenColor(StdDraw.DARK_GRAY);
        		 suma1++;
        	 }
        	 else {
        		 StdDraw.setPenColor(StdDraw.CYAN);
        		 }
        	 StdDraw.point(x, y);
        	 if (x * x + y * y <= 1) {
        		pi = 4. * (suma1 / total);
        		System.out.println(pi);
        	 }
          } 
         
          
          
      }
	}

