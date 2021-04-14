package exercise;

import java.util.Scanner;

public class 质数口袋 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int sum = 2, count = 1;
		if (l < sum) {
			System.out.println(0);
			return;
		}
		System.out.println(sum);
		for (int i = 3; i < l; i += 2) {
			if (isPrime(i)) {
				if (sum + i > l) {
					break;
				}
				System.out.println(i);
				sum += i;
				count++;
			}
		}
		System.out.println(count);
	}
	
	private static boolean isPrime(int n) {
		for (int i = 2; i * i <= n ; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
