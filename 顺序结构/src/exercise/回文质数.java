package exercise;

import java.util.Scanner;

public class 回文质数 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt();
		
		long startTime = System.currentTimeMillis();
		
		if (2 >= a && 2 <= b) {
			System.out.println(2);
		}
		int star;
		if (a % 2 == 0) {
			star = a + 1;
		}else {
			star = a;
		}
		for (int i = star; i <= b; i += 2) {
			if (isPalindrome(i) && isPrime(i)) {
				System.out.println(i);
			}
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("time:"+(endTime - startTime));
		
		
	}
	
	private static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isPalindrome(int n) {
		int temp = n;
		int rel = 0;
		while (temp != 0) {
			rel = rel * 10 + temp % 10;
			temp /= 10;
		}
		return rel == n;
	}

}
