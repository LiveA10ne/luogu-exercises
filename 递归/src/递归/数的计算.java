package 递归;

import java.io.*;
import java.util.ArrayList;

public class 数的计算 {
	
	private static int sum = 1;
	private static int[] arr = new int[1005];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= i / 2; j++) {
				arr[i] += arr[j];
			}
			arr[i]++;
		}
		pw.print(arr[n]);
		pw.close();
		
	}

}
