package 模拟与高精度;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 多项式输出 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		st.nextToken();
		int n = (int)st.nval;
		int[] arr = new int[n+1];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				continue;
			}
			if (i == n) {
				if (arr[i] > 0) {
					sb.append("+").append(arr[i]);
				}else {
					sb.append(arr[i]);
				}
				break;
			}
			if (i == n - 1) {
				if (arr[i] > 0) {
					if (arr[i] != 1) {
						sb.append("+").append(arr[i]).append("x");
					}else {
						sb.append("+").append("x");
					}
					
				}else {
					if (arr[i] != 1) {
						sb.append(arr[i]).append("x");
					}else {
						sb.append("-").append("x");
					}
				}
				continue;
			}
			if (arr[i] > 0) {
				if (arr[i] != 1) {
					sb.append("+").append(arr[i]).append("x^").append(n-i);
				}else {
					sb.append("+").append("x^").append(n-i);
				}
				
			}
			if (arr[i] < 0) {
				if (arr[i] != -1) {
					sb.append(arr[i]).append("x^").append(n-i);
				}else {
					sb.append("-").append("x^").append(n-i);
				}
			}
		}
		String rel = sb.toString();
		pw.print(rel.replaceAll("^[+]", ""));
		pw.close();
	}

}
