package exercise;

import java.util.Scanner;

public class 级数求和 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int n = 0;
		double sum = 0;
		while (sum <= k) {
			n++;
			sum += 1.0 / n;
		}
		System.out.println(n);
	}

}
