package 循环结构;

import java.util.Scanner;

public class 斐波那契数列 {
	
	static double[] arr = new double[50];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.printf("%.2f",fibonacci(n));
	}
	
	private static double fibonacci(int n) {
		if (arr[n] > 0) {
			return arr[n];
		}
		if (n == 0) {
			arr[0] = 0;
			return 0;
		}
		if (n == 1) {
			arr[1] = 1;
			return 1;
		}
		arr[n] = fibonacci(n - 1) + fibonacci(n - 2);
		return arr[n];
	}

}
