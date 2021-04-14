package 排序;

import java.io.*;
import java.util.Arrays;

public class 攀爬者 {
	
	static class Point implements Comparable<Point>{

		int x;
		int y;
		int z;
		
		public Point(int x, int y, int z) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		@Override
		public int compareTo(Point o) {
			// TODO Auto-generated method stub
			return this.z > o.z ? 1 : -1;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		st.nextToken();
		int n = (int)st.nval;
		Point[] arr = new Point[n];
		for (int i = 0; i < arr.length; i++) {
			st.nextToken();
			int x = (int)st.nval;
			st.nextToken();
			int y = (int)st.nval;
			st.nextToken();
			int z = (int)st.nval;
			arr[i] = new Point(x, y, z);
		}
		
		Arrays.sort(arr);
		double distance = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			distance += Math.sqrt(Math.pow(arr[i].x - arr[i+1].x, 2)+Math.pow(arr[i].y - arr[i+1].y, 2)+Math.pow(arr[i].z - arr[i+1].z, 2));
		}
		pw.printf("%.3f",distance);
		pw.close();
	}

}
