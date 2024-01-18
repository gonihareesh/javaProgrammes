package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamDemo 
{
 public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("demo7.txt");
    InputStreamReader isr=new InputStreamReader(fis);
    int data;
    while((data=isr.read())!=-1){
        System.out.print((char)data);
    }
    isr.close();
 }   
}
