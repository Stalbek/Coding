package Algorythms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SaveHumanity {
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
			int pl = V.length();
			System.out.println();
			int n = 0;
			if (pl > vl * 2) {
				String p = "(";
				for (int i = 0; i < vl; i++) {
					String pp = V.substring(0, i) + "." + V.substring(i + 1);
					if (i > 0)
						p += "|";
					p += pp;
				}
				p += ")";

				Pattern pt = Pattern.compile(p);
				Matcher m = pt.matcher(P);

				while (m.find()) {
					int pos = m.start();
					m.region(pos + 1, P.length());
					System.out.print(pos + " ");
					n++;
				}
			} else {
				for (int i=0; i<=pl-vl; i++) {
					int mis = 0;
					int j = 0;
					while ((mis < 2) && (j < vl)) {
						if (P.charAt(i+j) != V.charAt(j)) mis++;
						j++;
					}
					if (mis < 2) {
						System.out.print(i + " ");
						n++;
					}
				}
			}

			if (n == 0)
				System.out.print("No Match!");			
		}
	}
}
