package 递归;

import java.io.*;
import java.math.BigInteger;

public class 科特兰数 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		pw.print(catalan(n));
		pw.close();
	}
	
	private static BigInteger catalan(int n) {
		if (n == 1) {
			return BigInteger.ONE;
		}
		return catalan(n - 1).multiply(BigInteger.valueOf((4 * n - 2))).divide(BigInteger.valueOf(n+1));
	}

}
