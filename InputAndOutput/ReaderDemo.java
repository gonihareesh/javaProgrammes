package InputAndOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo 
{
public static void main(String[] args) throws IOException {
    Reader r=new FileReader("demo3.txt");
    int line;
    while((line=r.read())!=-1){
        System.out.print((char)line);
    }
    r.close();
}    
}
