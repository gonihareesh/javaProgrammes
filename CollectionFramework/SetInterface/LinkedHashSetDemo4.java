package CollectionFramework.SetInterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo4 
{
public static void main(String[] args) throws IOException {
    LinkedHashSet<Integer> ls=new LinkedHashSet<>();
    ls.add(12);
    ls.add(13);
    ls.add(14);
    ls.add(15);
    ls.add(16);
    BufferedWriter br=new BufferedWriter(new FileWriter("demo14.txt"));
    br.write("ids:");
    for(Integer i:ls){
        br.write(i.toString());
        br.newLine();
    }
    br.close();
    System.out.println("File has been created...");
}    
}
