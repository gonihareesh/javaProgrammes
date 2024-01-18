package InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutput 
{
public static void main(String[] args) throws IOException, ClassNotFoundException {
    int number=65;
    String data="this is objectInputStream";
    FileOutputStream fos=new FileOutputStream("demo2.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeInt(number);
    oos.writeObject(data);
    FileInputStream fis=new FileInputStream("demo2.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    System.out.println("integer value is :"+ois.readInt());
    System.out.println("String data is "+ois.readObject());
    oos.close();
    ois.close();
}    
}
