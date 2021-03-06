package 二分;

import java.io.*;
import java.util.Arrays;

public class 查找 {
	
	private static int[] arr;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		st.nextToken();
		int m = (int)st.nval;
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			arr[i] = (int)st.nval;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			st.nextToken();
			int key =(int)st.nval;
			int index = binarySearch(arr, key);
			if (index >= 0) {
				sb.append(index+1).append(" ");
			}else {
				sb.append(-1).append(" ");
			}
		}	
		pw.print(sb);
		pw.close();
	}
	
	private static int binarySearch(int[] a,int key) {
		int low = 0;
        int high = a.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            int midVal = a[mid];

            if (midVal < key)
                low = mid+1;
            else if (midVal >= key)
                high = mid;
            
            if (a[low] == key) {
    			return low;
    		}
        }
        return -1;
	}
}
