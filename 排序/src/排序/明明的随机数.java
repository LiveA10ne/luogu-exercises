package 排序;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class 明明的随机数 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(bf);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			st.nextToken();
			int num = (int)st.nval;
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		Collections.sort(list);
		pw.println(list.size());
		StringBuilder sb = new StringBuilder();
		for (Integer integer : list) {
			sb.append(integer+" ");
		}
		pw.print(sb);
		pw.close();
	}

}
