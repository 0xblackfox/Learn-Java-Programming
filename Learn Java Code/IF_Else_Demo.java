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
public class IF_Else_Demo {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        int num ;
        System.out.println("Enter any integer number =");
        num =  input. nextInt();
        
        if(num > 0){
            System.out.println("Positive number ");
        }
        else if (num < 0){
            System.out.println("Negetive number ");
        }
        else{
            System.out.println("Number value is Zero ");
        }
        
    }
    
}
