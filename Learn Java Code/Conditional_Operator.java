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
public class Conditional_Operator {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int num1,num2,result;
        
        System.out.println("Enter 2 number = ");
        num1 = input.nextInt();
        num2 = input.nextInt();
       //num3 = input.nextInt();
        
        result= ( num1 > num2 ) ? num1 : num2  ;
        System.out.println("Large Number = "+result);
        
        result= ( num1 < num2 ) ? num1 : num2  ;
        System.out.println("Small Number = "+result);
        
    }
}
