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
public class Leap_Year {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int year;
        System.out.println("Enetr any Year");
        year = input.nextInt();
        
        if ( year % 400 == 0 ){
            System.out.println("Leap Year");
        }
        else if ( year % 4 == 0   && year % 100 != 0 ){
            System.out.println("Leap Year");
        }
        else{
            System.out.println(" Not a Leap Year");
        }
        
    }
}
