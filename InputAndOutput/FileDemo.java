package InputAndOutput;
import java.io.FileOutputStream;

public class FileDemo 
{
public static void main(String[] args) {
    String data="This is FileOutputstream";
    try {
        FileOutputStream fos=new FileOutputStream("demo.txt");
        byte[] array=data.getBytes();
        fos.write(array);
        fos.close();
        System.out.println("File has been created..");
    } catch (Exception e) {
        
       System.out.println(e); 
    }   
}    
}
