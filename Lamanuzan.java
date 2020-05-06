package gitpractice2;
import java.util.Scanner;
import java.lang.Math;

public class Lamanuzan {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double pi=0;
		System.out.print("input iteration : ");
		int iteration = in.nextInt();
		for(int i = 0;i<iteration;i++) {
			pi += (factorial(4*i)*(1103+26390*i))/(square(factorial(i),4)*square(396,4*i));
		}
		pi = 1/pi;
		pi*= 1/(Math.sqrt(8)/9801);
		System.out.println("calculated value of pi : " + pi);
	}
	public static double square(double num, int times) {
		
		double result = 1;
		
		for(int i = 0;i<times;i++) {
			result *= num;
		}
		
		return result;
	}
	public static int factorial(int num) {
		
		if(num == 0)
			return 1;
		if(num == 1)
			return 1;
		
		return num*factorial(num-1);
	}
}