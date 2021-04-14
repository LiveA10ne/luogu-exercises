package exercise;

import java.util.Scanner;

public class 数字反转2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int copy = Math.abs(n);
		int reverse = 0;
		while (copy > 0) {
			reverse = reverse * 10 + copy % 10;
			copy = copy / 10;
		}
		if (n < 0) {
			System.out.println(-reverse);
			return;
		}
		System.out.println(reverse);
	}

}
