package 贪心;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;

public class 合并果子 {

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
		for (int i = 0; i < n - 1; i++) {
			int indexOfMin1 = minOfArr(arr);
			if (indexOfMin1 == -1) {
				break;
			}
			int min1 = arr[indexOfMin1];
			arr[indexOfMin1] = Integer.MAX_VALUE;
			int indexOfMin2 = minOfArr(arr);
			if (indexOfMin2 == - 1) {
				break;
			}
			int min2 = arr[indexOfMin1];
			arr[indexOfMin2] += min1 ;
			sum += arr[indexOfMin2];
		}
		
		
		pw.print(sum);
		pw.close();
		
	}
	
	private static int minOfArr(int[] arr) {
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}

}
