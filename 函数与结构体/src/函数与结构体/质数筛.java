package 函数与结构体;

import java.util.Arrays;
import java.util.Scanner;

public class 质数筛 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean[] primeList = initPrime(100000);
		for (int i = 0; i < n; i++) {
			int input = scanner.nextInt();
			if (primeList[input]) {
				System.out.print(input+" ");
			}
		}
	}
	
	private static boolean[] initPrime(int n) {
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int i = 2; i < prime.length; i++) {
			if (!prime[i]) {
				continue;
			}
			for (int j = i * 2; j < prime.length; j += i) {
				prime[j] = false;
			}
		}
		return prime;
	}

}
