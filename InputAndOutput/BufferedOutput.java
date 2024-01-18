package InputAndOutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput 
{
 public static void main(String[] args) throws IOException {
    FileOutputStream fos=new FileOutputStream("demo1.txt");
    BufferedOutputStream bo=new BufferedOutputStream(fos);
    String data="this is BufferedOutputStream";
    byte[] b=data.getBytes();
    bo.write(b);
    bo.close();
    fos.close();
    System.out.println("file has been created...");
 }   
}
