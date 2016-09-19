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
public class LisasWorkbook {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int t;
        
        int q = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            t = in.nextInt();
            p++;
            for (int s = 1; s <= t; s++) 
                if (s == p + (s-1)/k) q++;
            
            p += (t-1)/k;
        }
        System.out.println(q);
        
    }
}

