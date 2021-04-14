package 排序;

import java.io.*;
import java.util.Arrays;

public class 分数线划定 {
	
	static class Candidate implements Comparable<Candidate>{
		
		int num;
		int mark;
		
		public Candidate(int num, int mark) {
			// TODO Auto-generated constructor stub
			this.num = num;
			this.mark = mark;
		}
		
		public String show() {
			StringBuilder sb = new StringBuilder();
			sb.append(num).append(" ").append(mark);
			return sb.toString();
		}
		
		
		@Override
		public int compareTo(Candidate o) {
			// TODO Auto-generated method stub
			if (this.mark != o.mark) {
				return this.mark > o.mark ? 1: -1;
			}else {
				return this.num < o.num ? 1 : -1;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int m = (int)st.nval;
		Candidate[] arr = new Candidate[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			int num = (int)st.nval;
			st.nextToken();
			int mark = (int)st.nval;
			arr[i] = new Candidate(num, mark);
		}
		
		Arrays.sort(arr);
		int line = arr[n - (m + m / 2)].mark;
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].mark < line) {
				break;
			}
			if (arr[i].mark >= line) {
				count++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(line).append(" ").append(count).append("\n");
		for (int i = arr.length - 1; i >= arr.length - count ; i--) {
			sb.append(arr[i].show()).append("\n");
		}
		pw.print(sb);
		pw.close();
	}

}
