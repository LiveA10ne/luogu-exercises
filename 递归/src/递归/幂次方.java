package 递归;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 幂次方 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(bf);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		pw.print(parse(n));
		pw.close();
	}
	
	private static String parse(int n) {
		char[] num = Integer.toBinaryString(n).toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num.length; i++) {
			if (num[i] == '1') {
				if (num.length - 1 - i != 1 && num.length - 1 - i != 0) {
					sb.append("2(").append(parse(num.length - 1 - i)).append(")+");
				}else if (num.length - 1 - i == 1) {
					sb.append("2+");
				} else if (num.length - 1 - i == 0) {
					sb.append("2(0)+");
				}
			}
		}
		sb.replace(sb.length() - 1, sb.length(), "");
		return sb.toString();
	}

}
