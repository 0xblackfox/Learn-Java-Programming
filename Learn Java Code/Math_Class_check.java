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
public class Math_Class_check {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int x,y,result; 
        
        System.out.println("Enetr Any number = ");
        x = input.nextInt();
        
        System.out.println("Enetr Any number = ");
        y = input.nextInt();
        
        result = Math.max(x, y) ;
        System.out.println("Maximum number = "+result);
        
        result = Math.min(x, y) ;
        System.out.println("Minimum number = "+result);
        
        int absolute = Math.abs(y) ;
        System.out.println("Absolute number = "+absolute);
         int Round = Math.round(3.8f) ;
        System.out.println("Round number = "+Round);
        double power = Math.pow(x,y) ;
       System.out.println("X to the power y  = "+power);
        
      double E = Math.E ;
        System.out.println("E = "+E);
        
       double pi = Math.PI ;
        System.out.println("Pi ="+pi);
                
    }
    
}
