package 模拟与高精度;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class A加B高精度 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StreamTokenizer st = new StreamTokenizer(br);
//		st.ordinaryChars(33, 255);
//		st.wordChars(33, 255);
		st.nextToken();
		int s1 = (int)st.nval;
		st.nextToken();
		int s2 = (int)st.nval;
		pw.println(s1);
		pw.print(s2);
//		BigInteger a = new BigInteger(br.readLine());
//		BigInteger b = new BigInteger(br.readLine());
//		pw.print(a.add(b));
		pw.close();
	}

}
