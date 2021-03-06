package 二分;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

import javax.sound.midi.MidiChannel;

public class 一元三次方程求解 {
	
	private static double a;
	private static double b;
	private static double c;
	private static double d;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		a = st.nval;
		st.nextToken();
		b = st.nval;
		st.nextToken();
		c = st.nval;
		st.nextToken();
		d = st.nval;
		
		double l,r,fl,fr;
		int s = 0;
		for (int i = -100; i < 100; i++) {
			l = i;
			r = i + 1;
			fl = f(l);
			fr = f(r);
			if (fl == 0) {
				pw.printf("%.2f ",l);
				s++;
			}else if (fl * fr < 0) {
				while (r - l >= 0.001) {
					double mid = (l + r) / 2;
					if (f(l) * f(mid) < 0) {
						r = mid;
					}else {
						l = mid;
					}
				}
				pw.printf("%.2f ",l);
				s++;
			}
			if (s == 3) {
				break;
			}
		}
		pw.close();
	}
	
	private static double f(double x) {
		return a * Math.pow(x, 3) + b * x * x + c * x + d;
	}

}
