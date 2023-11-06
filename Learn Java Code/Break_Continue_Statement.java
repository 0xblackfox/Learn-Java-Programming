
package inputjava;

import java.util.Scanner;


public class Break_Continue_Statement {
    public static void main(String[] args){
      //  Scanner input= new Scanner(System.in);
        for(int i =1; i <= 100 ;i++){
        
             if( i ==10){
               continue;  
             }
             if(i>13){
                 break;
             }
           
        System.out.println(i);
        }
      
    }
}
