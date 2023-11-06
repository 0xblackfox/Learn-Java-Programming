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
public class Pass_fail {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number ; 
        
        System.out.println("Enter your number :");
        number = input.nextInt();
        
        if( number > 100 || number<0 ){
            System.out.println("Invalid Mark ");
        }
        else if( number >= 80 && number<=100 ){
            System.out.println("A+ ");
        }
        else if( number >= 70 && number<=79 ){
            System.out.println("A ");
        }
        else if( number >= 60 && number<=69 ){
            System.out.println("A- ");
        }
        else if( number >= 50 && number<=59 ){
            System.out.println("B ");
        }
        else if( number >= 40 && number<=49 ){
            System.out.println("C ");
        }
        else if( number >= 33 && number<=39 ){
            System.out.println("D ");
        }
        else {
            System.out.println("Fail ");
        }
        
    }
    
}
