package 函数与结构体;

import java.util.Scanner;

public class Test {
	private static boolean[] prime = new boolean[10001];

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		initPrimeList(n);
		for (int i = 4; i <= n; i+=2) {
			for (int j = 2; j < i; j++) {
				if (prime[j] && prime[i - j]) {
					System.out.printf("%d=%d+%d\n",i,j,i-j);
					break;
				}
			}
		}
	}
	
	private static void initPrimeList(int n) {
		for (int i = 2; i <= n; i++) {
			prime[i] = true;
		}
		for (int i = 2; i <=n; i++) {
			if (prime[i]) {
				for (int j = 2 * i; j <=n; j+=i) {
					prime[j] = false;
				}
			}
		}
	}

}
