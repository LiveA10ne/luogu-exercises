package 数组;

import java.util.Scanner;
import java.lang.Math;

public class 工艺品制作 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt(), x = scanner.nextInt(), h = scanner.nextInt();
		int q = scanner.nextInt();
		int[][][] cube= new int[21][21][21];
		while (q-- > 0) {
			int x1 = scanner.nextInt(), y1 = scanner.nextInt(), z1 = scanner.nextInt();
			int x2 = scanner.nextInt(), y2 = scanner.nextInt(), z2 = scanner.nextInt();
			for (int j = Math.min(x1, x2); j <= Math.max(x1, x2); j++) {
				for (int j2 = Math.min(y1, y2); j2 <= Math.max(y1, y2); j2++) {
					for (int k = Math.min(z1, z2); k <= Math.max(z1, z2); k++) {
						cube[j][j2][k] = 1;
					}
				}
			}
		}
		int sum = 0;
		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= x; j++) {
				for (int j2 = 1; j2 <= h; j2++) {
					if (cube[i][j][j2] == 0) {
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}

}
