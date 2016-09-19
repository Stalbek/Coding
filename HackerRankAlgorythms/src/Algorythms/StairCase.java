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
public class StairCase {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) 
                System.out.print(" ");
            for (int j = 0; j <= i; j++) 
                System.out.print("#");
            System.out.println();
        }        
        
    }
}
