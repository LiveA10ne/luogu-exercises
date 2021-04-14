package exercise;

import java.util.Scanner;

public class 计数问题 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), x= scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int t = i;
			while (t > 0) {
				if (t % 10 == x) {
					sum ++;
				}
				t /= 10;
			}
		}
		System.out.println(sum);
	}

}
