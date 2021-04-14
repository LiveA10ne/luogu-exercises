package 暴力枚举;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 烤鸡 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(bf);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		if (n > 30 || n < 10) {
			pw.print(0);
			pw.close();
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int a = 1; a <=3; a++) {
			for (int b = 1; b <=3; b++) {
				for (int c = 1; c <=3; c++) {
					for (int d = 1; d <=3; d++) {
						for (int e = 1; e <=3; e++) {
							for (int f = 1; f <=3; f++) {
								for (int g = 1; g <=3; g++) {
									for (int h = 1; h <=3; h++) {
										for (int i = 1; i <=3; i++) {
											for (int j = 1; j <=3; j++) {
												if (a+b+c+d+e+f+g+h+i+j == n) {
													count++;
													sb.append(a).append(" ").append(b).append(" ").
													append(c).append(" ").append(d).append(" ").
													append(e).append(" ").append(f).append(" ").
													append(g).append(" ").append(h).append(" ").
													append(i).append(" ").append(j).append("\n");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		pw.println(count);
		pw.print(sb);
		
		pw.close();
	}

}
