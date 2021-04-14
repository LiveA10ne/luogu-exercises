package 排序;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class 欢乐的跳 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			list.add(Math.abs(arr[i] - arr[i + 1]));
		}
		
		for (int i = 1; i < n; i++) {
			if (!list.contains(i)) {
				pw.print("Not jolly");
				pw.close();
				return;
			}
		}
		pw.print("Jolly");
		pw.close();
	}

}
