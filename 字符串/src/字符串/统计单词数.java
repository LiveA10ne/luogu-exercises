package 字符串;

import java.util.Scanner;

public class 统计单词数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String target = " "+scanner.next().toLowerCase()+" ";
		scanner.nextLine();
		String artitle = " "+scanner.nextLine().toLowerCase()+" ";
		int index = artitle.indexOf(target);
		if (index == -1) {
			System.out.println(index);
			return;
		}
		int count = 0;
		String[] arr = artitle.split("\\s");
		
		for (String string : arr) {
			if (target.trim().equals(string)) {
				count++;
			}
		}
		System.out.println(count+" "+index);
	}

}
