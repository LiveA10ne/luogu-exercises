package 排序;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 快速排序 {
	
	private static int[] arr = new int[100030];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		for (int i = 0; i < n; i++) {
			st.nextToken();
			arr[i] = (int) st.nval;
		}
		quickSort(0, n-1);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]+" ");
		}
		pw.print(sb);
		pw.close();
	}
	
	private static void quickSort(int left, int right) {
		int i = left, j = right;
		int key = arr[(i + j) / 2];
		while (i <= j) {
			while (arr[i] < key) {
				i++;
			}
			while (arr[j] > key) {
				j--;
			}
			if (j >= i) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (j > left) {
			quickSort(left, j);
		}
		if (i < right) {
			quickSort(i, right);
		}
	}

}
