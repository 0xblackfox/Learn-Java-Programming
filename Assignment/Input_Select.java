
package assaignment;

import java.util.Scanner;

public class Input_Select {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int num1,num2,x;
        System.out.println("Test Data :");
         System.out.print("Input the first integer  : ");
        num1 = input.nextInt();
        System.out.print("Input the second integer : ");
        num2 = input.nextInt();
        x= num1 * num2 ;  
        System.out.println("Product of the above two integers = " +x );
        
    }
}
