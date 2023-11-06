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
public class ArithmeticDemo {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int num1,num2,result;
      
        
        System.out.println("Enetr First number = ");
         num1= input.nextInt();
        System.out.println("Enetr Second number = ");
        num2= input.nextInt();
        
        result= num1 + num2;
        System.out.println("sum = "+result) ;
        
        result= num1 - num2;
        System.out.println("Subs = "+result) ;
        
        result= num1 * num2;
        System.out.println("Multiplication = "+result) ;
        
        double result2= (double) num1 / num2;
        System.out.println("Div = "+result2) ;
        
        result= num1 % num2;
        System.out.println("Remainder = "+result) ;
        
        
    }
    
}
