package 数组;

import java.util.Scanner;

public class 蛇形矩阵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] matrix = new int[10][10];
		int top = 1, botoom = n, left = 1, right = n;
		int i = 1, r = 1, c = 1;
		if (n % 2 == 1) {
			matrix[(n + 1) / 2][(n + 1) / 2] = n * n;
		}else {
			matrix[n / 2 + 1][n / 2] = n * n;
		}
		while (i < n * n) {
			while (i < n * n && c < right) {
				matrix[r][c++] = i++;
			}
			while (i < n * n && r < botoom) {
				matrix[r++][c] = i++;
			}
			while (i < n * n && c > left) {
				matrix[r][c--] = i++;
			}
			while (i < n * n && r > top+1) {
				matrix[r--][c] = i++;
			}
			top++;
			botoom--;
			left++;
			right--;
		}
		for (int j = 1; j <=n; j++) {
			for (int k = 1; k <= n; k++) {
				System.out.printf("%3d",matrix[j][k]);
			}
			System.out.println();
		}
	}

}
