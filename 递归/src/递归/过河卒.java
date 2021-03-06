package 递归;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class 过河卒 {
	
	private static int n;
	private static int m;
	private static int xHorse;
	private static int yHorse;
	private static long[][] matrix = new long[30][30];	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int)st.nval;
		st.nextToken();
		m = (int)st.nval;
		st.nextToken();
		xHorse= (int)st.nval;
		st.nextToken();
		yHorse = (int)st.nval;
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				matrix[i][j] = 1;
			}
		}
				
		matrix[xHorse][yHorse] = 0;
		if (xHorse - 1 >= 0 && yHorse - 2 >= 0) {
			matrix[xHorse - 1][yHorse - 2] = 0;
		}
		if (xHorse - 2 >= 0 && yHorse - 1 >= 0) {
			matrix[xHorse - 2][yHorse - 1] = 0;
		}
		if (xHorse - 2 >= 0 && yHorse + 1 <= 20) {
			matrix[xHorse - 2][yHorse + 1] = 0;
		}
		if (xHorse - 1 >= 0 && yHorse + 2 <= 20) {
			matrix[xHorse - 1][yHorse + 2] = 0;
		}
		if (xHorse + 1 <= 20 && yHorse + 2 <= 20) {
			matrix[xHorse + 1][yHorse + 2] = 0;
		}
		if (xHorse + 2 <= 20 && yHorse + 1 <= 20) {
			matrix[xHorse + 2][yHorse + 1] = 0;
		}
		if (xHorse + 2 <=20 && yHorse - 1 >= 0) {
			matrix[xHorse + 2][yHorse - 1] = 0;
		}
		if (xHorse + 1 <= 20 && yHorse - 2 >= 0) {
			matrix[xHorse + 1][yHorse - 2] = 0;
		}
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <=m; j++) {
				if (matrix[i][j] != 0) {
					if (i == 0 && j > 0) {
						matrix[i][j] = matrix[i][j - 1];
					}
					if (i > 0 && j == 0) {
						matrix[i][j] = matrix[i - 1][j];
					}
					if (i > 0 && j > 0) {
						if (matrix[i - 1][j] == 0 && matrix[i][j - 1] != 0) {
							matrix[i][j] = matrix[i][j - 1];
						}else if (matrix[i - 1][j] != 0 && matrix[i][j - 1] == 0) {
							matrix[i][j] = matrix[i-1][j];
						}else {
							matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
						}
					}
				}
			}
		}
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <=m; j++) {
				pw.print(matrix[i][j]+" ");
			}
			pw.println();
		}
	
		pw.print(matrix[n][m]);
		pw.close();
	}
	
	
	

}
