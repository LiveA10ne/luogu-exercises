package exercise;

import java.util.Scanner;

public class 数的性质 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = 0, b = 0, c = 0, d = 0;
		boolean isEven = n % 2 == 0;
		boolean isBetween = n > 4 && n <= 12;
		if (isEven && isBetween) {
			a = 1;
		}
		if (isEven || isBetween) {
			b = 1;
		}	
		if ((isEven && !isBetween) || (!isEven && isBetween)) {
			c = 1;
		}
		if (!isEven && !isBetween) {
			d = 1;
		}
		System.out.println(a+" "+b+" "+c+" "+d);
	}

}
