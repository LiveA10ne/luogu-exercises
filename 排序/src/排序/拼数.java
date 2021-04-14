package 排序;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class 拼数 {
	
	static class Cmp implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			String s1 = o1+o2;
			String s2 = o2+o1;
			return s1.compareTo(s2);
		}		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.ordinaryChars(33, 255);
		st.wordChars(33, 255);
		st.nextToken();
		int n = Integer.valueOf(st.sval);
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = st.sval;
		}
		
		
		Arrays.sort(arr, new Cmp());
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
		}
		pw.print(sb);
		pw.close();
	}

}
