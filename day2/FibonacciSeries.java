package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		  int range = 8;

	      int a = 0, b = 1, c;
	      System.out.println("Fibonacci series 8:");

	    for (int i = 0; i < range; i++) {
	    System.out.println(a);

	            c = a + b;
	            a = b;
	            b = c;

	        }

	    }

	}	
