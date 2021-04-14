package 二分;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class A减B数对 {
	
	private static long ans = 0;
	private static int n;
	private static BigInteger c;
	private static Map<BigInteger, Long> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		st.nextToken();
		n = (int)st.nval;
		st.ordinaryChars(33, 255);
		st.wordChars(33, 255);
		st.nextToken();
		c = new BigInteger(st.sval);

		
		for (int i = 0; i < n; i++) {
			st.nextToken();
			BigInteger key = new BigInteger(st.sval);
			if (map.get(key) == null) {
				map.put(key, (long) 1);
			}else {
				long value = map.get(key) + 1;
				map.put(key, value);
			}
		}
		
		for (Entry<BigInteger, Long> entry : map.entrySet()) {
			BigInteger add = c.add(entry.getKey());
			if (map.get(add) != null) {
				ans += map.get(add) * map.get(entry.getKey());
			}
		}
		pw.print(ans);
		pw.close();
	}

}
