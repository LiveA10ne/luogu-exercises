package 递归;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class Function {

	private static int[][][] arr = new int[25][25][25];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		StringBuilder sb = new StringBuilder();
		for (;;) {
			st.nextToken();
			int a = (int)st.nval;
			st.nextToken();
			int b = (int)st.nval;
			st.nextToken();
			int c = (int)st.nval;
			if (a == -1 && b == -1 && c == -1) {
				break;
			}
			sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
			.append(w(a, b, c)).append("\n");
		}
		pw.print(sb);
		pw.close();
	}
	
	
	
	private static int w(int a, int b, int c) {
		if (a <=0 ||b <= 0 ||c <= 0) {
			return 1;
		}else if (a > 20 ||b > 20 ||c > 20) {
			return w(20, 20, 20);
		}else if (arr[a][b][c] != 0) {
			return arr[a][b][c];
		}else if (a < b && b < c) {
			arr[a][b][c] = w(a, b, c - 1)+ w(a, b - 1, c - 1)- w(a, b - 1, c);
			return arr[a][b][c];
		}else {
			arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
			return arr[a][b][c];
		}
	}

}
