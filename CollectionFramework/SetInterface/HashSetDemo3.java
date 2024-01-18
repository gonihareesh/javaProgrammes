package CollectionFramework.SetInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class HashSetDemo3 
{
public static void main(String[] args) throws IOException {
    HashSet<String> hs=new HashSet<>();
    hs.add("Springboot");
    hs.add("Devops");
    hs.add("Servlets");
    hs.add("PowerBI");
    BufferedWriter bw=new BufferedWriter(new FileWriter("demo13.txt"));
    bw.write("course: \n");
    for(String course:hs){
        bw.write(course.toString());
        bw.newLine();
    }
    bw.close();
    System.out.println("file has been created..");
}    
}
