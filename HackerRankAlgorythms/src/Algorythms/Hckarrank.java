package Algorythms;

import java.util.Scanner;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Azios
 */
public class Hckarrank {

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
            boolean nomatch = true;

            String regx = "(";
            for (int i = 0; i < vl; i++) {
                String v = V.substring(0, i) + "." + V.substring(i + 1, vl);
                regx += v;
                if (i + 1 < vl) {
                    regx += "|";
                }
            }
            regx += ")";

            boolean onedif = false;
            boolean match = true;
            while (P.matches(regx)) {
                
            }
                for (int i = 0; i <= pl - vl; i++) {
                    int s = 0;
                    //String regx;

                    for (int j = 0; j < vl; j++) {
                        if (P.charAt(i + j) != V.charAt(j)) {
                            if (onedif) {
                                match = false;
                                break;
                            }
                            onedif = true;
                        }
                    }

                    if (match) {
                        System.out.print(i + " ");
                        nomatch = false;
                    }
                }
            if (nomatch) {
                System.out.print("No Match!");
            }
            System.out.println();
        }

    }

}
