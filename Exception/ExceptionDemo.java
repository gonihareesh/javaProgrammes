package Exception;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo 
{
 public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
    try (BufferedWriter bw = new BufferedWriter(new FileWriter("First.csv"))) {
    
      
        for(Integer data:al){
         
          bw.write(data.toString());
          bw.newLine();
        }
        bw.close();
         System.out.println("File has been created");
    } catch (IOException e) {
        
        e.printStackTrace();
    }
    
 }   
}
