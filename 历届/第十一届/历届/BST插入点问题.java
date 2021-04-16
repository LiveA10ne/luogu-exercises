package 历届;

import java.io.*;

public class BST插入点问题 {
	
	private static int n;
	private static int k;
	private static Node[] arr;
	
	static class Node{
		
		int left;
		int right;
		int value;
		
		public Node(int left, int right, int value) {
			// TODO Auto-generated constructor stub
			this.left = left;
			this.right = right;
			this.value = value;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int)st.nval;
		st.nextToken();
		k = (int)st.nval;
		arr = new Node[n+1];
		
		for (int i = 1; i <= n; i++) {
			st.nextToken();
			int parent = (int)st.nval;
			st.nextToken();
			int value = (int)st.nval;
		}
		
		
		pw.close();
		
	}

}
