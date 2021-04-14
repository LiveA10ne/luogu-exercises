package 排序;

import java.io.*;
import java.math.BigInteger;

public class 宇宙总统 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.ordinaryChars(33, 255);
		st.wordChars(33, 255);
		st.nextToken();
		int n = Integer.valueOf(st.sval);
		BigInteger[] arr = new BigInteger[n];
		
		for (int i = 0; i < n; i++) {
			st.nextToken();
			arr[i] = new BigInteger(st.sval);
		}
		
		BigInteger max = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].compareTo(max) > 0) {
				max = arr[i];
				index = i;
			}
		}
		
		pw.print(index+1+"\n"+max);
		pw.close();
	}

}
