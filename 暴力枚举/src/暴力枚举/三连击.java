package 暴力枚举;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class 三连击 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int a = (int)st.nval;
		st.nextToken();
		int b = (int)st.nval;
		st.nextToken();
		int c = (int)st.nval;
		
		int gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).gcd(BigInteger.valueOf(c)).intValue();
		if (gcd != 1) {
			a = a /gcd;
			b = b /gcd;
			c = c /gcd;
		}
		
		
		StringBuilder sb = new StringBuilder();
		tag:
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 1; k <=9; k++) {
					int num1 = i * 100 + j * 10 + k;
					if (num1 > 329) {
						break tag;
					}
					int num2,num3;
					num2 = num1 * b / a;
					num3 = num1 * c / a;
					if (num2 > 987 || num3 > 987) {
						break tag;
					}
					if (panduan(num1,num2,num3)) {
						sb.append(num1).append(" ").append(num2).append(" ").append(num3).append("\n");
					}
					
					
				}
			}
		}
		if (sb.length() == 0) {
			pw.print("No!!!");
		}else {
			pw.print(sb);
		}
		pw.close();
		
	}
	
	private static boolean panduan(int a, int b,int c) {
		int[] arr = new int[10];
		while (a > 0) {
			arr[a % 10]++;
			a /= 10;
		}
		while (b > 0) {
			arr[b % 10]++;
			b /= 10;
		}
		while (c > 0) {
			arr[c % 10]++;
			c /= 10;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]!= 1) {
				return false;
			}
		}
		return true;
	}

}
