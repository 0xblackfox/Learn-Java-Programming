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
public class Vowel_Consonent {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.println("Enter any alphabet");
        
        ch = input.nextLine().charAt(0);
        
        if (ch == 'a'){
            System.out.println("Vowel");
        }
        else if (ch == 'e'){
            System.out.println("Vowel");
        }
        else if (ch == 'i'){
            System.out.println("Vowel");
        }
        else if (ch == 'o'){
            System.out.println("Vowel");
        }
        else if (ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Cosonent");
        }
    }
    
}
