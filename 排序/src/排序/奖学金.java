package 排序;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 奖学金 {
	
	static class Student implements Comparable<Student>{
		int num;
		int chinese, math, english, sum;
		
		public Student(int num, int c, int m, int e) {
			// TODO Auto-generated constructor stub
			this.num = num;
			this.chinese = c;
			this.math = m;
			this.english = e;
			this.sum = c + m + e;
		}
		
		public String show() {
			StringBuilder sb = new StringBuilder();
			sb.append(this.num).append(" ").append(this.sum);
			return sb.toString();
		}
		
		@Override
		public int compareTo(Student b) {
			// TODO Auto-generated method stub
			if (this.sum > b.sum) {
				return 1;
			}else if (this.sum < b.sum) {
				return -1;
			}else {
				if (this.chinese > b.chinese) {
					return 1;
				}else if (this.chinese < b.chinese) {
					return -1;
				}else {
					if (this.num < b.num) {
						return 1;
					}
					return -1;
				}
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
		
		Student[] arr = new Student[n];
		for (int i = 0; i < n; i++) {
			st.nextToken();
			int chinese = (int)st.nval;
			st.nextToken();
			int math = (int)st.nval;
			st.nextToken();
			int english = (int)st.nval;
			arr[i] = new Student(i+1,chinese,math,english);
		}
		
		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		if (arr.length >= 5) {
			for (int i = arr.length - 1; i >= arr.length - 5; i--) {
				sb.append(arr[i].show()).append("\n");
			}
		}else {
			for (int i = arr.length - 1; i >=0; i--) {
				sb.append(arr[i].show()).append("\n");
			}
		}
		pw.print(sb);
		
		
		pw.close();
	}
	
}
