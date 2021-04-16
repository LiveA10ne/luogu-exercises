package 二叉树;

import java.io.*;
import java.util.LinkedList;

public class 淘汰赛 {
	
	private static int n;
	
	private static LinkedList<Country> queue = new LinkedList<>();
	
	static class Country implements Comparable<Country>{
		
		int index;
		int power;
		
		public Country(int index, int power) {
			// TODO Auto-generated constructor stub
			this.index = index;
			this.power = power;
		}

		@Override
		public int compareTo(Country o) {
			// TODO Auto-generated method stub
			return this.power >= o.power ? 1 : -1;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int) Math.pow(2, st.nval);
		
		for (int i = 1; i <= n; i++) {
			st.nextToken();
			queue.offer(new Country(i, (int)st.nval));
		}
		
		while (queue.size() > 2) {
			Country a = queue.poll();
			Country b = queue.poll();
			if (a.compareTo(b) > 0) {
				queue.offer(a);
			}else {
				queue.offer(b);
			}
		}
		Country a = queue.poll();
		Country b = queue.poll();
		if (a.compareTo(b) > 0) {
			pw.print(b.index);
		}else {
			pw.print(a.index);
		}
		
		pw.close();
	}

}
