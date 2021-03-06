package 递归;

import java.io.*;

public class 外星密码 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		StringBuilder sb = new StringBuilder(br.readLine());
		while (sb.indexOf("[") != -1) {
			int start = sb.lastIndexOf("[");
			int end = sb.substring(start).indexOf("]") + start;
			String ns = sb.substring(start + 1, end);
			String replace = rep(ns);
			sb.replace(start, end+1, replace);
		}
		pw.print(sb);	
		pw.close();
	}
	
	private static String rep(String s) {
		if (s.length() == 0) {
			return "";
		}
		StringBuilder sb = new StringBuilder(s);
		StringBuilder n = new StringBuilder();
		StringBuilder ns = new StringBuilder();
		char[] arr = s.toCharArray();
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				n.append(arr[i]);
			}else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				ns.append(arr[i]);
			}
		}
		int num = Integer.valueOf(n.toString());
		StringBuilder rel = new StringBuilder();
		for (int i = 0; i < num; i++) {
			rel.append(ns);
		}
		return rel.toString();
	}
		

}
