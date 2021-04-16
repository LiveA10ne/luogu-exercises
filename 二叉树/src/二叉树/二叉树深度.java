package 二叉树;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class 二叉树深度 {
	
	private static int n;
	private static Node[] arr;
	private static int ans = 0;
	
	static class Node{
		int left;
		int right;
		
		public Node(int left, int right) {
			// TODO Auto-generated constructor stub
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n= (int)st.nval;
		arr = new Node[n+1];
		for (int i = 1; i <=n; i++) {
			st.nextToken();
			int left = (int)st.nval;
			st.nextToken();
			int right = (int)st.nval;
			arr[i] = new Node(left, right);
		}
		bfs();
		
		pw.print(ans);
		pw.close();
	}
	
	private static void bfs() {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		int size = 0,cur = 0;
		while (!queue.isEmpty()) {
			size = queue.size();
			for (int i = 0; i < size; i++) {
				cur = queue.poll();
				if (arr[cur].left != 0) {
					queue.offer(arr[cur].left);
				}
				if (arr[cur].right != 0) {
					queue.offer(arr[cur].right);
				}
			}
			ans++;
		}
	}

}
