package 暴力枚举;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class 妖梦拼火柴 {
	
	//记录每个长度的火柴的根数
	private static int[] matchesLength = new int[5005];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(bf);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		
		int maxLength = 0;
		for (int i = 0; i < n; i++) {
			st.nextToken();
			int length = (int)st.nval;
			matchesLength[length]++;
			if (length > maxLength) {
				maxLength = length;
			}
		}
		
		BigInteger count = new BigInteger("0");
		for (int i = maxLength; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				int k = i - j;
				if (matchesLength[i] >= 2 && matchesLength[j] >= 1 && matchesLength[k] >= 1) {
					if (j == k) {
						count = count.add(
								BigInteger.valueOf(matchesLength[j])
								.multiply(BigInteger.valueOf(matchesLength[j] - 1))
								.divide(BigInteger.valueOf(2))
								.multiply(BigInteger.valueOf(matchesLength[i])
										.multiply(BigInteger.valueOf(matchesLength[i]-1))
										.divide(BigInteger.valueOf(2))));
						count = count.mod(new BigInteger("1000000007"));
					}else {
						count = count.add(BigInteger.valueOf(matchesLength[j])
								.multiply(BigInteger.valueOf(matchesLength[k]))
								.multiply(BigInteger.valueOf(matchesLength[i])
										.multiply(BigInteger.valueOf(matchesLength[i]-1))
										.divide(BigInteger.valueOf(2))));
						count = count.mod(new BigInteger("1000000007"));
					}
				}
			}
		}
	
		count = count.mod(new BigInteger("1000000007"));
		pw.print(count);
		pw.close();
		
	}
	

}
