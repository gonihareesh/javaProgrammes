package InputAndOutput;

import java.io.FileInputStream;

public class FileInput 
{
public static void main(String[] args) {
    try {
        FileInputStream fis=new FileInputStream("demo.txt");
        int i=fis.read();
        while ((i=fis.read() )!= -1) {
            System.out.print((char)i);
        }
        fis.close();
    } catch (Exception e) {
     e.getStackTrace();
    }
}    
}
