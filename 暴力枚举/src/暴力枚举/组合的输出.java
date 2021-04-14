package 暴力枚举;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 组合的输出 {
	
	private static int n;
	private static int k;
	private static int[] arr;
	private static boolean[] visited;
	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int)st.nval;
		st.nextToken();
		k = (int)st.nval;
		arr = new int[k + 3];
		visited = new boolean[n+3];
		
		dfs(1,1);
		pw.print(sb);
		pw.close();
		
	}
	
	private static void dfs(int cur,int startX) {
		if (cur > k) {
			for (int i = 1; i <= k; i++) {
				if (arr[i] >= 10) {
					sb.append(" ").append(arr[i]);
				}else {
					sb.append("  ").append(arr[i]);
				}
			}
			sb.append("\n");
			return;
		}
		for (int i = startX; i <=n; i++) {
			if (visited[i]) {
				continue;
			}
			arr[cur] = i;
			visited[i] = true;
			dfs(cur+1, i+1);
			visited[i] = false;
		}
	}

}
