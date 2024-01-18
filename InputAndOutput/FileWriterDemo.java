package InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
public static void main(String[] args) throws IOException {
    FileWriter fw=new FileWriter("demo4.txt");
    fw.write("this is fileWriter \n");
    fw.write("this is character-oriented data");
    fw.close();
}    
}
