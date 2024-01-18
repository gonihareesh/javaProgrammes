package InputAndOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInput 
{
public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("demo1.txt");
    BufferedInputStream bis=new BufferedInputStream(fis);
    int i;
    while((i=bis.read())!=-1){
        System.out.print((char)i);
    }
     bis.close();
     fis.close();
} 
  
}
