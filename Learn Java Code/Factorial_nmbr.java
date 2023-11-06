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
public class Factorial_nmbr {
    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);
      int n,result;
      result = 1;
         System.out.print("Enter any number : ");
         n=input.nextInt();
         for (int i = n ; i >= 1; i--) {
             result = result * i;
            System.out.print(i+" ");
        }
         System.out.println();
         System.out.println("The Factorial "+n+" is : "+result);
    }
    
}
