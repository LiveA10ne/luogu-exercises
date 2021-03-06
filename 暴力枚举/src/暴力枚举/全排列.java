package 暴力枚举;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 全排列 {
	
	
	private static int n;
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
		arr = new int[n+1];
		visited = new boolean[n+1];
		dfs(1);
		
		pw.print(sb);
		pw.close();
	}
	
	private static void dfs(int k) {
		if (k > n) {
			for (int i = 1; i <=n; i++) {
				sb.append("    ").append(arr[i]);
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <=n; i++) {
			if (visited[i]) {
				continue;
			}
			arr[k] = i;
			visited[i] = true;
			dfs(k + 1);
			visited[i] = false;
		}
	}

}
