package 暴力枚举;

import java.io.*;
import java.math.BigInteger;

public class 统计方形 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int m = (int)st.nval;
		
		BigInteger count = BigInteger.valueOf(n * (n + 1) / 2).multiply(BigInteger.valueOf(m * (m + 1) / 2));
					
		BigInteger countOfSquare = new BigInteger("0");
		for (int i = 1; i <= Math.min(n, m); i++) {
			countOfSquare = countOfSquare.add(BigInteger.valueOf((n - i + 1)*(m - i + 1)));
		}
		
		BigInteger countOfRec = count.subtract(countOfSquare);
		
		pw.print(countOfSquare+" "+countOfRec);
		pw.close();
	}

}
