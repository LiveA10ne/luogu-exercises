package 排序;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 选举学生会 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int m = (int)st.nval;
		int[] arr = new int[n+1];
		for (int i = 0; i < m; i++) {
			st.nextToken();
			arr[(int)st.nval]++ ;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				for (int j = 0; j < arr[i]; j++) {
					sb.append(i).append(" ");
				}
			}
		}
		pw.print(sb);
		pw.close();
	}

}
