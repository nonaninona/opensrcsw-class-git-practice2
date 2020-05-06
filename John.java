package gitpractice2;
import java.util.Scanner;

public class John {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double pi=1;
		System.out.print("input iteration : ");
		int iteration = in.nextInt();
		for(int i = 1;i<iteration;i++) {
			pi *= 1 - 1/(4*square(i,2));
		}
		pi = 1/pi;
		pi *= 2;
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