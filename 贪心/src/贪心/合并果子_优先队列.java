package 贪心;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.PriorityQueue;

public class 合并果子_优先队列 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			st.nextToken();
			queue.offer((int)st.nval);
		}
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			int min1 = queue.poll();
			int min2 = queue.poll();
			int com = min1 + min2;
			queue.offer(com);
			sum += com;
		}
		pw.print(sum);
		pw.close();
	}

}
