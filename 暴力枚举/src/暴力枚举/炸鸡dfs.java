package 暴力枚举;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;

public class 炸鸡dfs {
	
	private static int n;
	private static int count = 0;
	private static StringBuilder sb = new StringBuilder();
	private static ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
		st.nextToken();
		n = (int)st.nval;
		if (n > 30 || n < 10) {
			pw.print(0);
			pw.close();
			return;
		}
		dfs(0, 0);
		pw.println(count);
		StringBuilder sb2 = new StringBuilder();
		for (String string : list) {
			sb2.append(string).append("\n");
		}
		pw.print(sb2);
		pw.close();
	}
	
	private static void dfs(int total, int i) {
		if (i == 10) {
			if (total == n) {
				list.add(sb.toString());
				count++;
			}
		}else {
			for (int j = 1; j <=3; j++) {
				sb.append(j).append(" ");
				dfs(total+j, i+1);
				sb.setLength(sb.length() - 2);
			}
		}
				
	}

}
