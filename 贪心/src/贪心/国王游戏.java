package 贪心;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.Arrays;

public class 国王游戏 {
	
	private static Node[] arr = new Node[1005];
	
	static class Node implements Comparable<Node>{

		int left;
		int right;
		
		public Node(int left, int right) {
			// TODO Auto-generated constructor stub
			this.left = left;
			this.right = right;
		}
		
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.left * this.right >= o.left * o.right ? 1 : -1;
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
		int a = (int)st.nval;
		st.nextToken();
		int b = (int)st.nval;
		Node king = new Node(a, b);
		arr = new Node[n];
		for (int i = 0; i < n; i++) {
			st.nextToken();
			int left = (int)st.nval;
			st.nextToken();
			int right = (int)st.nval;
			arr[i] = new Node(left, right);
		}
		
		Arrays.sort(arr);
				
		BigInteger sum = BigInteger.valueOf(king.left);
		BigInteger ans = BigInteger.ZERO;
		BigInteger money ;
		for (int i = 0; i < n; i++) {
			money = sum.divide(BigInteger.valueOf(arr[i].right));
			if (money.compareTo(ans) > 0) {
				ans = money;
			}
			sum = sum.multiply(BigInteger.valueOf(arr[i].left));
		}
		
		pw.print(ans);
		pw.close();
		
	}

}
