package 线性表;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 询问学号 {
	
	private static int n;
	private static int m;
	private static int[] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n= (int)st.nval;
		st.nextToken();
		m= (int)st.nval;
		arr = new int[n+1];
		for (int i = 1; i <= n; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			st.nextToken();
			sb.append(arr[(int)st.nval]).append("\n");
		}
		pw.print(sb);
		pw.close();
	}

}
