
package java_exam_lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Kazi Ashikur Rahman
 */
public class File_Read_line_By_Line {
public static void main(String args[])  
{  
    try  {  
    File file=new File("E:\\3rd Semister Book File\\java_exam_lab\\Demo.txt");      
    FileReader fr=new FileReader(file);   
    BufferedReader br=new BufferedReader(fr);    
    StringBuffer sb=new StringBuffer();      
    String line;  
    while((line=br.readLine())!=null)  {  
          sb.append(line);       
        sb.append("\n");        
}  
    fr.close();      
    System.out.println("Contents of File: ");  
    System.out.println(sb.toString());     
}  
   catch(IOException e)  {  
    e.printStackTrace();  
}  
}  
}  
    

