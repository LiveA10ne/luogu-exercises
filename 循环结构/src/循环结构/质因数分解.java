package 循环结构;

import java.util.Scanner;

public class 质因数分解 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(n / i);
				return;
			}
		}
	}
	
	

}
