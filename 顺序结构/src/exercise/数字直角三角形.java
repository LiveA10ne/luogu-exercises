package exercise;

import java.util.Scanner;

public class 数字直角三角形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int index = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.printf("%02d",index++);
			}
			System.out.println();
		}
	}

}
