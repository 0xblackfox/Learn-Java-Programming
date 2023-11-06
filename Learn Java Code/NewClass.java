
package inputjava;

import java.util.Scanner;


public class NewClass {
    public static void main(String[] args)
 {
     Scanner input = new Scanner(System.in);
     double x ;
     
     System.out.print("Enter Any Number: ");
      x = input.nextDouble();
      
     System.out.println("Welcome " +x);
     System.out.println("Name\t\t: Kazi Ashikur Rahman"  );
    System.out.println("Door No,Street\t: Khilgaon,Dhaka"  );
    System.out.println("City,Pin Code\t: Dhaka,1219"  );
    int a=250 , b=85 , c=25 , y ;
      y=a/(b-c);
    System.out.println(y);
     int  Height = 7  ;
        int Width = 5  ;
        int perimeter = 2*(Height+Width);
        int Area = Height * Width ;
           
      System.out.println("Perimeter of the rectangle = " +perimeter+ (" inches") );
      System.out.println("Area of the rectangle =  " +Area+ (" inches") );
      double r = 6 ;
       double  A , p ;
       double pi= 3.14 ;
       p = 2*(pi*r) ;
       
       A = pi *(r*r) ;
       
     System.out.printf("Perimeter of the Circle =  %.6f inches \n",+p);
     System.out.printf("Area of the Circle  = %.6f inches \n",+A);
     int num1,num2,z;
        System.out.println("Test Data :");
         System.out.print("Input the first integer  : ");
        num1 = input.nextInt();
        System.out.print("Input the second integer : ");
        num2 = input.nextInt();
        z= num1 * num2 ;  
        System.out.println("Product of the above two integers = " +z );
     
    
    }
    
}
