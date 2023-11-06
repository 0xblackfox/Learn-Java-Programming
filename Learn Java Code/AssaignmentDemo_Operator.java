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
public class AssaignmentDemo_Operator {
    public static void main(String [] args){
        int x,y;
        x=5;
        y=3;
        
      x+=y; //x= x+y = 8
      System.out.println("x ="+x);
      
      x-=y; //x= x-y = 5
      System.out.println("x ="+x);
      
      x*=y; //x= x*y = 15
      System.out.println("x ="+x);
      
      x/=y; //x = x/y = 5
      System.out.println("x ="+x);
      
      x %= y; //x= x % y = 2
      System.out.println("x ="+x);
    }
    
}
