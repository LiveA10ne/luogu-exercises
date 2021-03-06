package 暴力枚举;

import java.io.*;

public class 涂国旗 {
	
	private static int n;
	private static int m;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int)st.nval;
		st.nextToken();
		m = (int)st.nval;
		br.readLine();
		
		String[] lines = new String[n];
		for (int i = 0; i < n; i++) {
			lines[i] = br.readLine();
		}
		int min = Integer.MAX_VALUE;
		
		for (int i = 1; i <= n - 2; i++) {
			for (int j = 1; j <= n - 2; j++) {
				for (int k = 1; k <= n - 2; k++) {
					int count = 0;
					if (i + j + k != n) {
						continue;
					}
					//白色i行
					for (int a = 0; a < i; a++) {
						count += painting(lines[a], 'W');
					}
					//蓝j行
					for (int b = i; b <j + i; b++) {
						count += painting(lines[b], 'B');
					}
					//红k行
					for (int c = i + j; c < k + i + j; c++) {
						count += painting(lines[c], 'R');
					}
					if (count < min) {
						min = count;
					}
				}
			}
		}
		pw.print(min);
		pw.close();
	}
	
	private static int painting(String line, char color) {
		int count = 0;
		char[] arr = line.toCharArray();
		for (char c : arr) {
			if (c != color) {
				count++;
			}
		}
		return count;
	}

}
