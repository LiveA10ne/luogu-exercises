package 排序;

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 求第k小的数 {

	private static int k;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		k = (int)st.nval;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		quickSort(arr, 0, n-1);
		pw.print(arr[k]);
		pw.close();
	}
	
	private static void quickSort(int[] arr, int left, int right) {
		int i = left, j = right;
		int key = arr[(i+j)/2];
		while (j >= i) {
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
		if (j > left && j >= k) {
			quickSort(arr, left, j);
		}
		if (i < right && i <= k) {
			quickSort(arr, i, right);
		}
	}

}
