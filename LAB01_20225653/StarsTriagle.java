/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.LAB01;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
public class StarsTriagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int m = n*2 -1;
        for(int i=1;i<=n;i++) {
            for(int j=1; j<=m;j++) {
                if(j >= (m/2 +1 - (i*2-1-1)/2) && j <= (m/2 +1 + (i*2-1-1)/2)){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
