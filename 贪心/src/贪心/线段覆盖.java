package 贪心;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 线段覆盖 {
	
	static class Line implements Comparable<Line>{
		
		int left;
		int right;
		
		public Line(int left, int right) {
			// TODO Auto-generated constructor stub
			this.left = left;
			this.right = right;
		}
		
		@Override
		public int compareTo(Line o) {
			// TODO Auto-generated method stub
			return this.right > o.right ? 1 : - 1;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(bf);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		Line[] arr = new Line[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			int left = (int)st.nval;
			st.nextToken();
			int right = (int)st.nval;
			arr[i] = new Line(left, right);
		}
		
		Arrays.sort(arr);
		int cout = 1;
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].left >= arr[index].right) {
				cout++;
				index = i;
			}
		}
		pw.print(cout);
		pw.close();
	}

}
