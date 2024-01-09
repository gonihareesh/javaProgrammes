package Exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ExceptionDemo2 
{
public static void main(String[] args) {
    List<String> list=new LinkedList<>();
   
    list.add("chair");
    list.add("table");
    list.add("lamp");
    list.add("books");
    try {
        BufferedWriter bw=new BufferedWriter(new FileWriter("Second.csv"));
        bw.write("Student Stady table..");
        for(String data:list){
             
           
            bw.write(data.toString());
            bw.newLine();
        }
        bw.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    finally{
        System.out.println("This is File Handling with Exception Handling");
    }
}    
}
