package 递归;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class 蜜蜂路线 {
	
	private static BigInteger[][] arr = new BigInteger[1005][1005];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			StreamTokenizer st = new StreamTokenizer(bf);
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
			st.nextToken();
			int m = (int)st.nval;
			st.nextToken();
			int n = (int)st.nval;
			pw.print(dfs(m, n));
			pw.close();
	}
	
	private static BigInteger dfs(int m, int n) {
		if (arr[m][n] != null) {
			return arr[m][n];
		}
		if (n - m == 1) {
			arr[m][n] = BigInteger.ONE;
			return BigInteger.ONE;
		}
		if (n - m == 2) {
			arr[m][n] = BigInteger.valueOf(2);
			return arr[m][n];
		}
		arr[m][n] = dfs(m,n - 1).add(dfs(m ,n - 2));
		return arr[m][n];
	}

}
