package 集合;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 村村通 {
	
	//城市数量
	private static int n;
	//道路条数
	private static int m;
	private static int ans;
	private static StringBuilder sb = new StringBuilder();
	private static int[] fa = new int[10000];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		while (true) {
			ans = 0;
			st.nextToken();
			n= (int)st.nval;
			if (n == 0) {
				break;
			}
			for (int i = 1; i <= n; i++) {
				fa[i] = i;
			}
			st.nextToken();
			m = (int)st.nval;
			for (int i = 0; i < m; i++) {
				st.nextToken();
				int x = (int)st.nval;
				st.nextToken();
				int y = (int)st.nval;
				merge(x, y);
			}
			for (int i = 1; i <= n; i++) {
				if (f(i) == i) {
					ans++;
				}
			}
			sb.append(ans-1).append("\n");
		}
		
		pw.print(sb);
		pw.close();
	}
	
	private static int f(int x) {
		if (fa[x] == x) {
			return fa[x];
		}else {
			fa[x] = f(fa[x]);
			return fa[x];
		}
	}
	
	private static void merge(int x, int y) {
		fa[f(x)] = f(y);
	}

}
