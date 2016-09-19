/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorythms;

import java.util.Scanner;

/**
 *
 * @author Azios
 */
public class SherlockAndSquares {
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int ai = 0; ai < t; ai++) {
            int A = in.nextInt();
            int B = in.nextInt();
            
            //System.out.println("A = " + A + "       B  = " + B);
            int C = A;
            if (A > B) {
                A = B;
                B = C;
                //System.out.println("Swapped: A = " + A + "       B  = " + B);   
            }
     
            int q = 0;
            int i = (int)Math.floor(Math.sqrt((double) A));
            C = i * i;
            while (C <= B) {
               if (C >= A) q++;                 
               i++;
               C = i * i;
            }
            System.out.println(q);
        }

    }
     
}
