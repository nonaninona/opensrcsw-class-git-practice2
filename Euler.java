package gitpractice2;
import java.util.Scanner;
import java.lang.Math;

public class Euler {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double pi=0;
		System.out.print("input iteration : ");
		int iteration = in.nextInt();
		for(int i = 1;i<iteration;i++) {
			pi += 1/square(i,2);
		}
		pi *= 6;
		pi = Math.sqrt(pi);
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