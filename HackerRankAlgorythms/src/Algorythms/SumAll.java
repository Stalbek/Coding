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
public class SumAll {
     public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] t;
        t = new int[n];
        for (int i = 0; i < t.length; i++) {
            t[i] = in.nextInt();            
        }        
        
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int tt = in.nextInt();
            sum += tt;
        }        
         System.out.println(sum);
    }
}
