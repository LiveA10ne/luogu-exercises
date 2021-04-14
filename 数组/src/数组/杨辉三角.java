package 数组;

import java.util.Scanner;

public class 杨辉三角 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] triAng = new int[n+1][n+1];
		for (int i = 1; i <=n; i++) {
			triAng[i][1] = triAng[i][i] = 1;
			for (int j = 2; j < i; j++) {
				triAng[i][j] = triAng[i - 1][j - 1] + triAng[i - 1][j];
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(triAng[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
