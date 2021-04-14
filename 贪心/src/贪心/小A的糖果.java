package 贪心;

import java.io.*;

public class 小A的糖果 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int x = (int)st.nval;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		
		long sum = 0;
		if (arr.length == 1) {
			if (arr[0] > x) {
				sum = arr[0] - x;
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + arr[i+1] <= x) {
				continue;
			}else if (arr[i] <= x) {
				int eat = arr[i] + arr[i+1] - x;
				sum += eat;
				arr[i+1] -= eat ;
			}else if (arr[i] > x) {
				int eat = arr[i+1] + arr[i] - x;
				sum += eat;
				arr[i] = x;
				arr[i+1] = 0;
			}
			
		}
		
//		for (int i : arr) {
//			pw.print(i+" ");
//		}
		pw.print(sum);
		pw.close();
	}	

}
