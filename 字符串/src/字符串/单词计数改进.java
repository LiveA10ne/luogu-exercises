package 字符串;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class 单词计数改进 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		String target = " "+bw.readLine().toLowerCase()+" ";
		String artitle = " "+bw.readLine().toLowerCase()+" ";		
		int index = artitle.indexOf(target);
		if (index == -1) {
			pw.print(index);
			pw.flush();
			pw.close();
			return;
		}
		int count = 0;
		String[] arr = artitle.split("\\s");
		
		for (String string : arr) {
			if (target.trim().equals(string)) {
				count++;
			}
		}
		pw.print(count+" "+index);
		pw.flush();
		pw.close();
	}

}
