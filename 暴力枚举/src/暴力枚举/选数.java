package 暴力枚举;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.function.IntConsumer;

public class 选数 {
	
	private static int n;
	private static int k;
	private static boolean[] primeTable;
	private static int[] arr;
	private static int count = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		st.nextToken();
		n = (int)st.nval;
		st.nextToken();
		k = (int)st.nval;
		arr = new int[n];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
			sum += arr[i];
		}
		primeTable = new boolean[sum+1];
		initPrime();
		
		dfs(0, 0,0);
		pw.print(count);
		
		
		pw.close();
	}
	
	private static void dfs(int current,int sum,int startx) {
		if (current == k) {
			if (primeTable[sum]) {
				count++;
				return;
			}
		}
		for (int i = startx; i < arr.length; i++) {
			dfs(current + 1, sum + arr[i],i+1);
		}
		
	}
	
	private static void initPrime() {
		for (int i = 2; i < primeTable.length; i++) {
			primeTable[i] = true;
		}
		for (int i = 0; i < primeTable.length; i++) {
			if (!primeTable[i]) {
				continue;
			}
			for (int j = 2 * i; j < primeTable.length; j += i) {
				primeTable[j] = false;
			}
		}
	}

}
