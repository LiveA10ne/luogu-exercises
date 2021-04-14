package 字符串;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class 阶乘数码 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StreamTokenizer st = new StreamTokenizer(br);
		
		st.nextToken();
		int t = (int)st.nval;
		
		for (int i = 0; i < t; i++) {
			st.nextToken();
			int n = (int)st.nval;
			st.nextToken();
			int a = (int)st.nval;
			BigInteger rel = mul(n);
			char[] arr = String.valueOf(rel).toCharArray();
			int sum = 0;
			for (char c : arr) {
				if (c == String.valueOf(a).charAt(0)) {
					sum++;
				}
			}
			pw.println(sum);
			
		}
		
		pw.close();
	}
	
	private static BigInteger mul(int n) {
		if (n == 1) {
			return BigInteger.valueOf(1);
		}
		return mul(n-1).multiply(BigInteger.valueOf(n));
	}

}
