package 贪心;

import java.io.*;

public class 删数问题 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StreamTokenizer st = new StreamTokenizer(br);
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String num= br.readLine();
		char[] numArr = num.trim().toCharArray();
		st.nextToken();
		//需要选的数
		int k = numArr.length - (int)st.nval;
		
		StringBuilder sb = new StringBuilder();
		int star = 0;
		for (int i = k; i > 0; i--) {
			int min = indexOfMin(numArr, star, numArr.length - i);
			sb.append(numArr[min]);
			star = min + 1;
		}
		pw.print(Integer.parseInt(sb.toString().trim()));
		pw.close();
	}
	
	public static int indexOfMin(char[] arr,int start, int end) {
		char min = arr[start];
		int index = start;
		for (int i = start; i <= end; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
			}
		}
		return index;
	}

}
