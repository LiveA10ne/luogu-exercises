package exercise;

import java.util.Scanner;

public class 金币 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int sum = 0;
		int days = 0;
		outer:
		for (int i = 1; i <= k ; i++) {
			for (int j = 0; j < i; j++) {
				days++;
				sum += i;
				if (days == k) {
					break outer;
				}
				
			}
		}
		System.out.println(sum);
	}

}
