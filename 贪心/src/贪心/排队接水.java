package 贪心;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;

public class 排队接水 {
	
	static class WaitTime implements Comparable<WaitTime>{
		
		int index;
		int time;
		
		public WaitTime(int index, int time) {
			// TODO Auto-generated constructor stub
			this.index = index;
			this.time = time;
		}
		
		@Override
		public int compareTo(WaitTime o) {
			// TODO Auto-generated method stub
			if (this.time == o.time) {
				return 0;
			}
			return this.time > o.time ? 1 : -1;
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(bf);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		WaitTime[] arr = new WaitTime[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = new WaitTime(i, (int)st.nval);
		}
		
		Arrays.sort(arr);
		int waitTimeEveryone = 0;
		BigDecimal sumTime = BigDecimal.ZERO;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].index + 1).append(" ");
			if (i != 0) {
				waitTimeEveryone = waitTimeEveryone + arr[i - 1].time;
				sumTime = sumTime.add(BigDecimal.valueOf(waitTimeEveryone)) ;
			}
		}
		
		pw.print(sb+"\n");
//		pw.printf("%.2f", 1.0 * sumTime /n);
		pw.print(sumTime.divide(BigDecimal.valueOf(n), 2,RoundingMode.HALF_UP));
		pw.close();
		
	}

}
