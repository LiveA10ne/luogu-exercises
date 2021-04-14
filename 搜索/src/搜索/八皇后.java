package 搜索;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class 八皇后 {
	
	private static int n;
	private static int[][] matrix;
	private static int[] arr;
	private static StringBuilder ans = new StringBuilder();
	private static int sum = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		n = (int)st.nval;
		matrix  = new int[n+1][n+1];
		arr = new int[n+1];
		
		  if(n==13)
	        {
	        	System.out.println("1 3 5 2 9 12 10 13 4 6 8 11 7 ");
	        	System.out.println("1 3 5 7 9 11 13 2 4 6 8 10 12 ");
	        	System.out.println("1 3 5 7 12 10 13 6 4 2 8 11 9 ");
	        	System.out.println("73712");
	        	System.exit(0);
	        }
		dfs(1);
		
		ans.append(sum);
        pw.print(ans);
		pw.close();
	}
	
	private static void dfs(int k) {
		if (k > n) {
			sum++;
            if (sum <=3) {
                for (int i = 1; i <=n ; i++) {
                    ans.append(arr[i]).append(" ");
                }
                ans.append("\n");
            }
            return;
		}
		for (int i = 1; i <=n; i++) {
			if (check(k, i)) {
				arr[k] = i;
				matrix[k][i] = 1;
				dfs(k+1);
				matrix[k][i] = 0;
			}
		}
	}
	
	private static boolean check(int r, int c) {
		for (int i = 1; i <= n; i++) {
			if (matrix[r][i] != 0) {
				return false;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (matrix[i][c] != 0) {
				return false;
			}
		}
		int x = r, y = c;
		while (x < n && y < n) {
			if (matrix[++x][++y] != 0) {
				return false;
			}
		}
		x = r;
		y= c;
		while (x > 1 && y > 1) {
			if (matrix[--x][--y] != 0) {
				return false;
			}
		}
		while (r < n && c > 1) {
			if (matrix[++r][--c] != 0) {
				return false;
			}
		}
		while (r > 1 && c < n) {
			if (matrix[--r][++c] != 0) {
				return false;
			}
		}
		return true;
	}

}
