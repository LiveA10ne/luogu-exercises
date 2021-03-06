package 暴力枚举;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 火柴棒等式 {
	
	private static int[] arr = {6,2,5,5,4,5,6,3,7,6};

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		
		int[] matches = new int[2001];
		matches[0] = 6;
		for (int i = 1; i <= 2000; i++) {
			int copy = i;
			while (copy > 0) {
				matches[i] += arr[copy % 10];
				copy = copy / 10;
			}
		}
		
		int count = 0;
		for (int i = 0; i <=1000; i++) {
			for (int j = 0; j <= 1000; j++) {
				if (matches[i] + matches[j] + matches[i+j] + 4 == n) {
					count++;
				}
			}
		}
		pw.print(count);
		pw.close();
	}

}
