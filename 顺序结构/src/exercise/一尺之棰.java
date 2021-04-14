package exercise;

import java.util.Scanner;

public class 一尺之棰 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int days = 1;
		while (n != 1) {
			n /= 2;
			days++;
		}
		System.out.println(days);
	}

}
