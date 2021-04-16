package 历届;

import java.io.*;

public class 分类计数 {
	
	private static char[] arr;
	private static StringBuilder sb = new StringBuilder();
	private static int upper = 0;
	private static int lower = 0;
	private static int digit = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		arr = br.readLine().toCharArray();
		for (char c : arr) {
			if (Character.isUpperCase(c)) {
				upper++;
			}else if (Character.isLowerCase(c)) {
				lower++;
			}else if (Character.isDigit(c)) {
				digit++;
			}
		}
		sb.append(upper).append("\n").append(lower).append("\n").append(digit);
		
		pw.print(sb);
		pw.close();
	}

}
