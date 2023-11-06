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
public class Capital_Small_letter {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.println("Enter any alphabet");
        ch = input.next().charAt(0);
        
        if( ch >= 'a' && ch <= 'z'){
            System.out.println("Small word ");
            
        }
        else if( ch >= 'A' && ch <= 'Z'){
            System.out.println("Capital word ");
            
        }
        else{
            System.out.println("Not a word ");
            
        }
        
        
    
  }
}
