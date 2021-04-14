package 模拟与高精度;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.ArrayList;

public class 最大乘积 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StreamTokenizer st = new StreamTokenizer(br);
		
		ArrayList<Integer> list = new ArrayList<>();
		st.nextToken();
		int n = (int)st.nval;
		
		int sum = 0;
		for (int i = 2; i < n; i++) {
			sum += i;
			if (sum > n) {
				sum -= i;
				break;
			}
			list.add(i);
		}
		
		int remainder = n - sum;
		
		
		while (remainder > 0) {
			for (int i = list.size() - 1; i >= 0; i--) {
				if (remainder <=0) {
					break;
				}
				if (remainder > 0) {
					list.set(i, list.get(i)+1);
					remainder--;
				}
			}
		}
		
		for (Integer integer : list) {
			pw.print(integer+" ");
		}
		pw.println();
		
		
		BigInteger rel = new BigInteger("1");
		
		for (Integer integer : list) {
			rel = rel.multiply(BigInteger.valueOf(integer));
		}
		
		pw.print(rel);
		
		
		pw.close();
	}

}
