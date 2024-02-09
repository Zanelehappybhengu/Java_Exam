/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;
import java.util.Scanner;
/**
 *
 * @author Dell-User
 */
public class Fibonacci {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);
        
        scanner.close();
    }

    // Method to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        
        for (int i = 1; i <= n; ++i) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
