/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputjava;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum;
        sum=1;
        System.out.println("Enter any number : ");
        n= input.nextInt();
        for (int i = 1; i <=  n; i= i+1) {
            sum = sum* (i*i);
            System.out.print(i+"x"+i+" ");
        }
        System.out.println(" ");
        System.out.println("Reault : "+sum);
    }
    
}
