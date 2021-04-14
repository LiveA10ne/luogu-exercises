package 排序;

import java.io.*;
import java.util.Arrays;

public class BookshelfB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int b = (int)st.nval;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] =(int)st.nval;
		}
		
		
		Arrays.sort(arr);
		int cow = 0, height = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (height >= b) {
				break;
			}
			if (height < b) {
				height += arr[i];
				cow++;
			}
		}
		pw.print(cow);
		pw.close();
	}

}
