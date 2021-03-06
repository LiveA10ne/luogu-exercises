package 二分;

import java.io.*;
import java.util.Arrays;


public class 砍树 {
	
	private static int n;
	private static long m;
	private static long[] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken(); 
		n = (int)st.nval;
		st.nextToken();
		m = (long)st.nval;
		arr = new long[n];
		long right = 0;
		for (int i = 0; i < n; i++) {
			st.nextToken();
			arr[i] = (long)st.nval;
			if (arr[i] > right) {
				right = arr[i];
			}
		}
		
		
		long left =0;
		while (right >= left) {
			long sum = 0;
			long mid = (right + left) / 2;
			for (int i = 0; i < n; i++) {
				if (arr[i] > mid) {
					sum += arr[i] - mid;
				}
			}if (sum >= m) {
				left = mid + 1;
			}else if (sum < m) {
				right = mid - 1 ;
			}
		}

		pw.print(right);
		pw.close();
	}
}
	
