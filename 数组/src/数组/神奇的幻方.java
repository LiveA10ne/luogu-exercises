package 数组;

import java.util.Scanner;

public class 神奇的幻方 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] matrix = new int[n+1][n+1];
		matrix[1][(n+1)/2] = 1;
		for (int i = 2; i <= n * n; i++) {
			fillBlank(matrix, i);
		}
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void fillBlank(int[][] matrix, int k) {
		int n = matrix.length - 1;
		int x = 0 ,y = 0;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if (matrix[i][j] == k - 1) {
					x = i;
					y = j;
				}
			}
		}
		if (x == 1 && y != n) {
			matrix[n][y+1] = k;
		}else if (x != 1 && y == n ) {
			matrix[x - 1][1] = k;
		}else if (x == 1 && y == n) {
			matrix[x + 1][y] = k;
		}else if (x != 1 && y != n) {
			if (matrix[x - 1][y + 1] == 0) {
				matrix[x - 1][y + 1] = k;
			}else {
				matrix[x + 1][y] = k;
			}
		}
	}

}
