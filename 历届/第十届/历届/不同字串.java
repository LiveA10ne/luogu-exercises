package 历届;

import java.util.HashSet;

public class 不同字串 {

	private static String string = "0100110001010001";
	private static HashSet<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < string.length(); i++) {
			for (int j = i; j < string.length(); j++) {
				set.add(string.substring(i, j+1));
			}
		}
		System.out.println(set.size());
	}

}
