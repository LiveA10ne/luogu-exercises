package 历届;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 外卖店优先级 {
	//店铺数量n,t时刻内m条订单
	private static int n;
	private static int m;
	private static int t;
	//保存某个时刻某个店铺的订单数
	private static int[][] timeAndId;
	//保存某个时刻某个店铺的优先级
	private static int[][] level;
	//保存某时刻某店铺是否在优先缓存里
	private static boolean[][] priority;
	private static int ans = 0;

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
		t = (int)st.nval;
		timeAndId = new int[t + 1][n + 1];
		priority = new boolean[t + 1][n + 1];
		level = new int[t + 1][10000];
		for (int i = 1; i <= m; i++) {
			st.nextToken();
			int ts = (int)st.nval;
			st.nextToken();
			int id = (int)st.nval;
			timeAndId[ts][id]++;
		}
		
		for (int i = 1; i <= t; i++) {
			for (int j = 1; j <= n; j++) {
				if (timeAndId[i][j] > 0) {
					level[i][j] = level[i - 1][j] + 2 * timeAndId[i][j];
				}else {
					if (level[i - 1][j] > 0) {
						level[i][j] = level[i - 1][j] - 1;
					}
				}
				priority[i][j] = priority[i - 1][j];
				if (level[i][j] > 5) {
					priority[i][j] = true;
				}else if (level[i][j] <= 3) {
					priority[i][j] = false;
				}
			}
		}
		
		
		for (int i = 1; i <= n; i++) {
			if (priority[t][i]) {
				ans++;
			}
		}
		
		pw.print(ans);
		pw.close();
	}

}
