package InputAndOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo 
{
public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new FileReader("demo5.txt"));
    String data;
    while((data=br.readLine())!=null){
        System.out.println(data);
    }
    br.close();
}    
}
