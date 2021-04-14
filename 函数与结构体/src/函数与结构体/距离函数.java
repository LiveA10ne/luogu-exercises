package 函数与结构体;

import java.util.Scanner;

public class 距离函数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble(), b = scan.nextDouble(), c = scan.nextDouble(), d = scan.nextDouble(),
				e = scan.nextDouble(), f = scan.nextDouble();
		System.out.printf("%.2f",distance(a, b, c, d, e, f));
	}
	
	private static double distance(double a, double b, double c, double d, double e, double f) {
		return Math.hypot(a - c, b - d) + Math.hypot(a - e, b - f) + Math.hypot(c - e, d - f);
	}

}
