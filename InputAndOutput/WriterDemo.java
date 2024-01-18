package InputAndOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo 
{
public static void main(String[] args) {
    try {
        Writer w=new FileWriter("demo3.txt") ;
        String content="lord shiva gives you krishna bhakti";
        w.write(content);
        w.close();
        System.out.println("file has been created..");
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}    
}
