package 动态规划;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 零一背包 {
	
	private static int capacity;
	private static int	n;
	private static int[] weight;
	private static int[] value;
	private static int[][] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		capacity = (int)st.nval;
		st.nextToken();
		n = (int)st.nval;
		weight = new int[n+1];
		value = new int[n+1];
		arr = new int[n+1][capacity+1];
		for (int i = 1; i <= n; i++) {
			st.nextToken();
			weight[i] = (int)st.nval;
		}
		for (int i = 1; i <= n; i++) {
			st.nextToken();
			value[i] = (int)st.nval;
		}
		
		pw.print(dp(4, 10));
		pw.close();
		
		
	}
	
	private static int dp(int i, int j) {
		if (arr[i][j] != 0) {
			return arr[i][j];
		}else if (i == 0 || j == 0) {
			return 0;
		}else if (j < weight[i]) {
			arr[i][j] = dp(i - 1, j);
			return arr[i][j];
		}else {
			arr[i][j] = Math.max(dp(i - 1, j), dp(i - 1, j - weight[i]) + value[i]);
			return arr[i][j];
		}
	}

}
