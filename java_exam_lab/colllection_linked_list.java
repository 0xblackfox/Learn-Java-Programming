/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_exam_lab;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Kazi Ashikur Rahman
 */
public class colllection_linked_list {
     public static void main(String[] args) {

     LinkedList<String> l_list = new LinkedList<String>(); 
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
     System.out.println("Original list:" + l_list);    
    
    l_list.addFirst("White");
    l_list.addLast("Pink");
    
     System.out.println("Final list:" + l_list); 
    
}
}