package 数组;

import java.util.Scanner;

public class 旗鼓相当的对手 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((arr[i][0] - arr[j][0] >= -5 &&arr[i][0] - arr[j][0] <= 5) &&
						(arr[i][1] - arr[j][1] >= -5 &&arr[i][1] - arr[j][1] <= 5) &&
						(arr[i][2] - arr[j][2] >= -5 && arr[i][2] - arr[j][2] <= 5)	&&
						(arr[i][0] + arr[i][1] + arr[i][2] - arr[j][0] - arr[j][1] - arr[j][2] >= -10&&
								arr[i][0] + arr[i][1] + arr[i][2] - arr[j][0] - arr[j][1] - arr[j][2] <= 10)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
