package 历届;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 特别数的和 {
	
	private static int n;
	private static int ans = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int)st.nval;
		for (int i = 1; i <= n; i++) {
			if (cotain(i)) {
				ans += i;
			}
		}
		pw.println(ans);
		pw.close();
	}
	
	private static boolean cotain(int n) {
		int d;
		while (n > 0) {
			d = n % 10;
			if (d == 2 || d == 0 || d == 1 || d == 9) {
				return true;
			}
			n = n / 10;
		}
		return false;
	}

}
