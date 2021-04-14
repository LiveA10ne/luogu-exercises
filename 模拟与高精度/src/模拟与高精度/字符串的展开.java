package 模拟与高精度;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 字符串的展开 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StreamTokenizer st = new StreamTokenizer(br);
		
		st.nextToken();
		int p1 = (int)st.nval;
		st.nextToken();
		int p2 = (int)st.nval;
		st.nextToken();
		int p3 = (int)st.nval;
		
		br.readLine();
		String input = br.readLine();
		char[] arr = input.toCharArray();
		StringBuilder sb = new StringBuilder(input);
		
		for (int i = 1; i < arr.length-1; i++) {
			if (arr[i] == '-') {
				if ((arr[i-1] >= '0' && arr[i-1]<='9' &&  arr[i+1] >= 'a' && arr[i+1]<='z') ||
						(arr[i-1] >= 'a' && arr[i-1]<='z' &&  arr[i+1] >= '0' && arr[i+1]<='9')	) {
					continue;
				}
				if (arr[i-1] == '-' || arr[i+1] == '-') {
					continue;
				}
				if (arr[i - 1] + 1 == arr[i + 1]) {
					sb.replace(i, i+1, "");
					arr = sb.toString().toCharArray();
					continue;
				}else if (arr[i - 1] >= arr[i + 1]) {
					continue;
				}else if (p1 == 1) {
					StringBuilder sb2 = new StringBuilder();
					char star = arr[i - 1], end = arr[i + 1];
					for (char j = (char) (star + 1); j <= end - 1; j = (char) (j + 1)) {
						for (int k = 0; k < p2; k++) {
							sb2.append(j);
						}
					}
									
					if (p3 == 1) {
						sb.replace(i, i+1, sb2.toString());
					}else if (p3 == 2) {
						sb.replace(i, i+1, sb2.reverse().toString());
					}
					arr = sb.toString().toCharArray();
					continue;
					
				}else if (p1 == 2) {
					StringBuilder sb2 = new StringBuilder();
					char star = arr[i - 1], end = arr[i + 1];
					for (char j = (char) (star + 1 - 32); j <= end - 1 - 32; j = (char) (j + 1)) {
						for (int k = 0; k < p2; k++) {
							sb2.append(j);
						}
					}
									
					if (p3 == 1) {
						sb.replace(i, i+1, sb2.toString());
					}else if (p3 == 2) {
						sb.replace(i, i+1, sb2.reverse().toString());
					}
					arr = sb.toString().toCharArray();
					continue;
				}else if (p1 == 3) {
					StringBuilder sb2 = new StringBuilder();
					char star = arr[i - 1], end = arr[i + 1];
					for (int j = 0; j < end - star-1 ; j++) {
						for (int k = 0; k < p2; k++) {
							sb2.append("*");
						}
						
					}
					sb.replace(i, i+1, sb2.toString());
					arr = sb.toString().toCharArray();
					continue;
				}
			}
		}
		
		pw.print(sb.toString());
		
		pw.close();
	}

}
