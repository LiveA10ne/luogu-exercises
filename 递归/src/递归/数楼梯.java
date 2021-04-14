package 递归;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class 数楼梯 {
	
	private static BigInteger[] arr = new BigInteger[5005];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		
		pw.print(stairway(n));
		pw.close();
		
	}
	
	private static BigInteger stairway(int steps) {
		if (arr[steps] != null) {
			return arr[steps];
		}
		if (steps == 0) {
			return BigInteger.ZERO;
		}
		if (steps == 1) {
			arr[1] = BigInteger.ONE;
			return arr[1];
		}
		if (steps == 2) {
			arr[2] = new BigInteger("2");
			return arr[2];
		}
		arr[steps] = stairway(steps - 1).add(stairway(steps - 2));
		return arr[steps];
	}

}
