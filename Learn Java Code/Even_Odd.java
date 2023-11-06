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
public class Even_Odd {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int num ;
        System.out.println("Enter any number");
        num = input . nextInt();
        
        if(num%2==0){
            System.out.println("Even");
        }
        else{
             System.out.println("Odd");
        }
    }
    
}
