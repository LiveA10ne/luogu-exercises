package 历届;

import java.io.*;
import java.math.BigInteger;

public class 八次求和 {
	
	private static int n;
	private static int ans;
	private static int mod = 123456789;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int)st.nval;
		
		for (int i = 1; i <= n; i++) {
			ans +=pow(i, 8); 
			ans = ans % mod;
		}
		
		pw.print(ans % mod);
		pw.close();
	}
	
	private static long pow(int x, int e) {
		long ans = 1;
		while (e > 0) {
			ans = ans * x % mod;
			e--;
		}
		return ans % mod;
	}

}
