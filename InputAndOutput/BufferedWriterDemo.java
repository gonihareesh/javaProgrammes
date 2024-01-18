package InputAndOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo 
{
public static void main(String[] args) throws IOException {
    BufferedWriter bw=new BufferedWriter(new FileWriter("demo5.txt"));
    bw.write("This is BufferedWriter.");
    bw.newLine();
    bw.write("This is used to provied Buffering for write instances.");
    
    bw.close(); 
    System.out.println("file has been created.."); 
}
  
}
