package InputAndOutput;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInput 
{
public static void main(String[] args) throws IOException {
    byte[] array={1,2,3,4};
    ByteArrayInputStream bis=new ByteArrayInputStream(array);
    System.out.println("Available byte in initial:"+bis.available());
    bis.read();
    bis.read();
    System.out.println("Available bytes after "+bis.available());

bis.close();
}    
}
