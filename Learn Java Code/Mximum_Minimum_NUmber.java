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
public class Mximum_Minimum_NUmber {
     public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int num1,num2,num3 ;
        System.out.print("Enter first number = ");
        num1 = input . nextInt();
        System.out.print("Enter second number = ");
        num2 = input . nextInt();
        System.out.print("Enter Third number = ");
       num3 = input . nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println("Maximum number = "+num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("Maximum Number = "+num2);
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("Maximum Number = "+num3);
        }
        else{
            System.out.println("The number is zero");
        }
   
     
     }
    
}
