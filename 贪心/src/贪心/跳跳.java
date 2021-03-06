package 贪心;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Arrays;

public class 跳跳 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		
		BigInteger max = BigInteger.ZERO;
		Arrays.sort(arr);
		max = max.add(BigInteger.valueOf(arr[n-1]).pow(2));
		int left = 0, right = n - 1;
		while (right > left) {
			max = max.add(BigInteger.valueOf(arr[right] - arr[left]).pow(2));
			right--;
			max = max.add(BigInteger.valueOf(arr[right] - arr[left]).pow(2));
			left++;
		}
		
		
		pw.print(max);
		pw.close();
	}

}
