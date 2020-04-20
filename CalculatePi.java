package gitpractice2;

import java.util.Scanner;

public class CalculatePi {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double pi=0;
		System.out.print("input iteration : ");
		int iteration = in.nextInt();
		for(int i = 1;i<iteration;i++) {
			pi += square(-1,(int)i+1) / (2*(double)i-1);
		}
		pi *= 4;
		System.out.println("calculated value of pi : " + pi);
	}
	
	public static double square(double num, int times) {
		
		double result = 1;
		
		for(int i = 0;i<times;i++) {
			result *= num;
		}
		
		return result;
	}
}
