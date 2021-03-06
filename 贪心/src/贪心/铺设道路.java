package 贪心;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 铺设道路 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		
		int sum = 0;
		for (;;) {
			int left = -1, right = - 1;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					left = i;
					break;
				}
			}
			if (left == -1) {
				break;
			}
			for (int i = left; i < arr.length; i++) {
				if (arr[i] != 0) {
					right = i;
				}else if (arr[i] == 0) {
					break;
				}
			}
			if (left != -1 && right != -1) {
				int min = minOfRange(arr, left, right);
				for (int i = left; i <= right; i++) {
					arr[i] -= min;
				}
				sum += min;
			}
		}
		
		pw.print(sum);
		pw.close();
	}
	
	private static int minOfRange(int[] arr, int left, int right) {
		int min = arr[left];
		for (int i = left; i <= right; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
