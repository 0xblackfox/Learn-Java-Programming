/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputjava;

import java.util.Scanner;


public class Even_nmbr_M_to_N {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int sum = 0;
        int m,n;
        
        System.out.print("The First Input : " );
        m = input.nextInt();
        
        System.out.print("The Final Input : " );
         n = input.nextInt();
         
        for (int i = m; i <= n; i++) {
            
            if(i%2 == 0){
            
            sum = sum + i;
            System.out.print(" "  +i); }   
        }
        System.out.println("");
        System.out.println(" The number is : " +sum);
        
    }
    
}
