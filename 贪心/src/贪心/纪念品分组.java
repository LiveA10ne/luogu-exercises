package 贪心;

import java.io.*;
import java.util.Arrays;

public class 纪念品分组 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int w = (int)st.nval;
		st.nextToken();
		int n = (int)st.nval;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] =(int)st.nval;
		}
		
		Arrays.sort(arr);
		int left = 0, right = n - 1;
		int ans = 0;
		while (right >=left) {
			if (arr[left] + arr[right] <= w) {
				left++;
				right--;
				ans++;
			}else {
				right--;
				ans++;
			}
		}
		
		pw.print(ans);
		pw.close();
	}

}
