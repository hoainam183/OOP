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

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("Nhap m: ");
        int m = sc.nextInt();
        
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] sum = new int[n][m];
        
        System.out.println("Nhap mang 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Nhap mang 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        
        System.out.println("Tong 2 mang: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
