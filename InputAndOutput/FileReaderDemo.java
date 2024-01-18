package InputAndOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo 
{
public static void main(String[] args) throws IOException {
    FileReader fr=new FileReader("demo4.txt");
    int line;
    while((line=fr.read())!=-1){
        System.out.print((char)line);
    }
    fr.close();
}    
}
