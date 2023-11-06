/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputjava;

/**
 *
 * @author User
 */
public class Increment_Decrement_Operator {
    public static void main(String[] args){
        int x , y ,z;
        x = 13;
        
        y = ++x ;
                System.out.println("Y = "+y); // y = 14
        z = y + x ;
        System.out.println("Z = " +z);  // z = o
        
       y = --x ;
                System.out.println("Y = "+y); // y = 13
        z = y - x ;
        System.out.println("Z = " +z); // z = 0
       y = x++ ;
                System.out.println("Y = "+y); // y = 11
        z = y + x ;
        System.out.println("Z = " +z); // z = 22
       y = x-- ;
                System.out.println("Y = "+y); // y = 11
        z = y - x ;
        System.out.println("Z = " +z); // z = 22
       y = x ;
                System.out.println("Y = "+y); // y = 11
        z = y + x ;
        System.out.println("Z = " +z); // z = 22
       
        
    }
    
    
}
