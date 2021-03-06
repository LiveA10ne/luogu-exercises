package 搜索;

import java.io.*;
import java.util.Arrays;

public class 考前临时抱佛脚 {
	
	private static int[] s = new int[5];
	private static int[] arr = new int[61];
	private static int[][] dp = new int[21][601];
	private static int ans = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		for (int i = 1; i <= 4; i++) {
			st.nextToken();
			s[i] = (int)st.nval;
		}
		for (int i = 1; i <=4; i++) {
			if (s[i] == 1) {
				st.nextToken();
				ans += (int)st.nval;
				continue;
			}else if (s[i] == 2) {
				st.nextToken();
				int a = (int)st.nval;
				st.nextToken();
				int b = (int)st.nval;
				ans += Math.max(a, b);
				continue;
			}else {
				
				int sum = 0;
				for (int j = 1; j <= s[i]; j++) {
					st.nextToken();
					arr[j] = (int)st.nval;
					sum += arr[j];	
				}
				ans += Math.max(f(s[i], sum / 2), sum - f(s[i], sum / 2));
				for (int j = 1; j <= s[i]; j++) {
					arr[j] = 0;
				}
			}
			
		}
		
		
		pw.print(ans);
		pw.close();
		
	}
	
	private static int f(int i, int j) {
		if (dp[i][j] > 0) {
			return dp[i][j];
		}else if (i == 0 || j == 0) {
			return 0;
		}else if (j < arr[i]) {
			dp[i][j] = f(i - 1, j);
			return dp[i][j];
		}else {
			dp[i][j] = Math.max(f(i - 1, j), f(i - 1, j - arr[i]) + arr[i] );
			return dp[i][j];
		}
	}
}
