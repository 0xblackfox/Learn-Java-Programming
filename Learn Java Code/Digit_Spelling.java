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
public class Digit_Spelling {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int digit ;
        System.out.println("Enter any digit : ");
        digit = input.nextInt();
        
        switch(digit){
            case 0 :
                System.out.println("Zero");
                break;
              case 1 :
                System.out.println("one"); 
                break;
            case 2 :
                System.out.println("two");
                break;
              case 3 :
                System.out.println("three");   
                break;
            case 4 :
                System.out.println("four");
                break;
              case 5 :
                System.out.println("five"); 
                break;
            case 6 :
                System.out.println("six");
                break;
              case 7 :
                System.out.println("seven"); 
                break;
            case 8 :
                System.out.println("eight");
                break;
              case 9 :
                System.out.println("NIne"); 
                break;
             default :
                 System.out.println("The digit is invalid");
                          
            
        }
        
                
                
    }
    
}
