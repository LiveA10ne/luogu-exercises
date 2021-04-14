package 循环结构;

import java.util.Scanner;

public class 求三角形 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int drawing = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%02d",drawing++);
			}
			System.out.println();
		}
		System.out.println();
		drawing = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("%02d",drawing++);
			}
			System.out.println();
		}
	}

}
