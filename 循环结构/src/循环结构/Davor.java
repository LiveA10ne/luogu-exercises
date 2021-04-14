package 循环结构;

import java.util.Scanner;

public class Davor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int j = 1; ; j++) {
			for (int i = 100; i > 0 ; i--) {
				if ((7 * i + 21 * j) * 52 == n) {
					System.out.println(i);
					System.out.println(j);
					return;
				}
			}
		}
	}

}
