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
public class Temperature_Conv {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        double cels, fer ;
        
        System.out.print("Ferenhite = ");
        fer = input.nextDouble();
        
        cels = ((fer - 32) / 9 ) * 5 ;
        System.out.println("Celcius = "+cels);
        
        
    }
    
}
