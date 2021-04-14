package 模拟与高精度;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.math.BigInteger;

public class A乘B {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		st.ordinaryChars(33, 255);
		st.wordChars(33, 255);
		st.nextToken();
		BigInteger a = new BigInteger(st.sval);
		st.nextToken();
		BigInteger b = new BigInteger(st.sval);
		pw.print(a.multiply(b));
		pw.close();
	}

}
