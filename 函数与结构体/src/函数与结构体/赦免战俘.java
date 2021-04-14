package 函数与结构体;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class 赦免战俘 {
	
	private static int length;
	private static int[][] matrix = new int[1030][1030];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = scanner.nextInt();
		length = (int) Math.pow(2, n);
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				matrix[i][j] = 1;
			}
		}
		
		zf(1, 1, length);
		
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				pw.print(matrix[i][j] + " ");
			}	
			pw.println();
		}
		pw.close();
		scanner.close();
	}
	
	private static void zf(int x, int y, int len) {
		if (len == 2) {
			matrix[x][y] = 0;
			return;
		}
		for (int i = x; i <x +  len / 2; i++) {
			for (int j = y; j <y + len /2; j++) {
				matrix[i][j] = 0;
			}
		}
		zf(x + len / 2, y, len / 2);
		zf(x + len / 2, y + len / 2, len / 2);
		zf(x , y+ len / 2, len / 2);
		
	}

}
