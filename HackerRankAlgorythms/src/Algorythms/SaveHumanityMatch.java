package Algorythms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SaveHumanityMatch {
	/**
	 *
	 * @author Stalbek
	 */

	public static void main(String[] args) {
		// TODO code application logic here
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int ai = 0; ai < t; ai++) {
			String P = in.next();
			String V = in.next();
			
			int vl = V.length();
			int pl = P.length();
			int n = 0;
			
			String p = "(?:";
			for (int i = 0; i < vl; i++) {
				p += "["+V.charAt(i)+"|[.]]";
			}
			p += ")";
			System.out.println(p);

			Pattern pt = Pattern.compile(p);
			Matcher m = pt.matcher(P);

			while (m.find()) {
				int pos = m.start();
				m.region(pos + 1, pl);
				System.out.print(pos + " ");
				n++;
			}

			if (n == 0)
				System.out.print("No Match!");
			System.out.println();
		}
	}
}
