package 递归;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 小A点菜 {
	
	private static int m;
	private static int n;
	private static int[] arr;
	private static int count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		//菜品
		n = (int)st.nval;
		st.nextToken();
		//钱
		m = (int)st.nval;
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		dfs(0, 0);
		pw.print(count);
		pw.close();
	}
	
	private static void dfs(int x,int curM) {
		if (curM == m) {
			count++;
			return;
		}
		if (x == n) {
			return;
		}
		if (curM + arr[x] <= m) {
			dfs(x + 1, curM + arr[x]);
		}
		dfs(x + 1, curM);
	}

}
