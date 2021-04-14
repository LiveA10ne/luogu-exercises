package 贪心;

import java.io.*;
import java.util.Arrays;

public class 部分背包问题 {
	
	static class Coin implements Comparable<Coin>{
		int sum;
		double value;
		int sumValue;
		
		public Coin(int sum, int sumValue) {
			// TODO Auto-generated constructor stub
			this.sum = sum;
			this.sumValue = sumValue;
			this.value  = 1.0 * sumValue / sum;
		}

		@Override
		public int compareTo(Coin o) {
			// TODO Auto-generated method stub
			return this.value > o.value ? 1 : -1;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(bf);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int t = (int)st.nval;
		Coin[] arr = new Coin[n];
		for (int i = 0; i < n; i++) {
			st.nextToken();
			int num = (int)st.nval;
			st.nextToken();
			int sumValue = (int)st.nval;
			arr[i] = new Coin(num,sumValue);
		}
		
		Arrays.sort(arr);
		double maxValue = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].sum <= t) {
				maxValue += arr[i].sumValue;
				t -= arr[i].sum;
			}else if (t < arr[i].sum) {
				maxValue += t * arr[i].value;
				break;
			}
		}
		
		pw.printf("%.2f",maxValue);
		pw.close();
	}

}
