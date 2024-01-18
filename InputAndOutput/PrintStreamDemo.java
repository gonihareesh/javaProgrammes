package InputAndOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo 
{
public static void main(String[] args) throws FileNotFoundException {
    PrintStream ps=new PrintStream(new FileOutputStream("demo6.txt"));
    ps.println(2023);
    ps.println("this is printStream");
    ps.println("This is provides methods to write data to another stream");
    ps.close();
    System.out.println("file has been created..");
}    
}
