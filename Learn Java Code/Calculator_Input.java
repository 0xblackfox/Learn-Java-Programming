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
public class Calculator_Input {
    public static void main (String [] args){
        int num1=0;
        int num2=0;
        char operator;
        double answer=0.0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enetr First number =");
        num1=input.nextInt();
        System.out.print("Enetr Second number =");
        num2=input.nextInt();
        System.out.print("Enetr the Operation =");
        operator=input.next().charAt(0);
        
        switch (operator) {
            case '+' : answer=num1+num2;
            break;
            case '-' : answer=num1-num2;
            break;
            case '*' : answer=num1*num2;
            break;
            case '%' : answer=num1%num2;
            break;
        }
            System.out.println(num1+""+operator+""+num2+" = "+answer);

    }
}
