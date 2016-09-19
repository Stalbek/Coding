/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorythms;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Stalbek
 */
public class SaveHumanityDNA {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int ai = 0; ai < t; ai++) {
            String P = in.next();
            String V = in.next();

            int pl = P.length();
            int vl = V.length();
            
            int n = 0;
            
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
            
            if (n == 0) System.out.print("No Match!");
            System.out.println();
        }

    }

}
