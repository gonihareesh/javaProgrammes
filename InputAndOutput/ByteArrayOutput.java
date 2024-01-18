package InputAndOutput;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutput 
{
public static void main(String[] args) throws IOException {
    String data="This is ByteArrayOutputStream";
    ByteArrayOutputStream out=new ByteArrayOutputStream();
    byte[] arr=data.getBytes();
    out.write(arr);
    String streamData=out.toString();
    System.out.println("Output Stream :"+streamData);
    out.close();
}    
}
