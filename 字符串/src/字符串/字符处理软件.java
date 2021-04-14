package 字符串;

import java.util.ArrayList;
import java.util.Scanner;

public class 字符处理软件 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<String> store = new ArrayList<>(n);
		StringBuilder initString = new StringBuilder(scanner.next());
		for (int i = 0; i < n; i++) {
			int order = scanner.nextInt();
			if (order == 1) {
				initString.append(scanner.next());
				store.add(initString.toString());
			}else if (order == 2) {
				int star = scanner.nextInt(), end = scanner.nextInt();
				initString = new StringBuilder(initString.substring(star, star + end));
				store.add(initString.toString());
			}else if (order == 3) {
				int index = scanner.nextInt();
				String insert = scanner.next();
				initString.insert(index, insert);
				store.add(initString.toString());
			}else if (order == 4) {
				store.add(String.valueOf(initString.indexOf(scanner.next())));
			}
		}
		for (String string : store) {
			System.out.println(string);
		}
		scanner.close();
		
	}
	
	

}
