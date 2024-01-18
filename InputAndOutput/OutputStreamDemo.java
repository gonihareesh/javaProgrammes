package InputAndOutput;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamDemo 
{
  public static void main(String[] args) throws IOException {
    FileOutputStream fos=new FileOutputStream("demo7.txt");
    OutputStreamWriter osw=new OutputStreamWriter(fos);
    osw.write("This is OutputStream \n");
    osw.write("This Stream is bridge between Character and byte stream");
    osw.close();
}
}
