package 函数与结构体;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 哥德巴赫猜想 {
	
	private static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		st.nextToken();
		int n = (int) st.nval;
		initPrimeList(n);
		for (int i = 4; i <= n; i+=2) {
			for (int j = 2; j < i; j++) {
				if (prime[j] && prime[i - j]) {
					pw.printf("%d=%d+%d\n",i,j,i-j);
					break;
				}
			}
		}
		pw.close();
	}
	
	private static void initPrimeList(int n) {
		for (int i = 2; i <= n; i++) {
			prime[i] = true;
		}
		for (int i = 2; i <=n; i++) {
			if (prime[i]) {
				for (int j = 2 * i; j <=n; j+=i) {
					prime[j] = false;
				}
			}
		}
	}

}
