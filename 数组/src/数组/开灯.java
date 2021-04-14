package 数组;

import java.util.Scanner;

public class 开灯 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		boolean[] lamp = new boolean[2000001];
		int end = 0;
		for (int i = 0; i < n; i++) {
			double a = scanner.nextDouble();
			int t = scanner.nextInt();
			if ((int)(a * t) > end) {
				end = (int)(a * t);
			}
			for (int j = 1; j <=t; j++) {
				lamp[(int)(a * j)] = !lamp[(int)(a * j)];
			}
		}
		for (int i = 1; i <= end; i++) {
			if (lamp[i]) {
				System.out.println(i);
				break;
			}
		}
	}

}
