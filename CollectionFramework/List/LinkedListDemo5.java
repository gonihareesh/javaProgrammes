package CollectionFramework.List;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class LinkedListDemo5 
{
public static void main(String[] args) throws IOException {
    LinkedList<String> li=new LinkedList<>();
    li.add("Bahubali");
    li.add("K.G.F");
    li.add("RRR");
    li.add("Kantara");
    BufferedWriter bw=new BufferedWriter(new FileWriter("demo11.txt"));
    bw.write("List of top movies\n");
    for(String movies:li){
        bw.write(movies.toString());
        bw.newLine();
    }
bw.close();
System.out.println("file has been created..");


BufferedReader br=new BufferedReader(new FileReader("demo11.txt"));
String name;
while((name=br.readLine())!=null){
    System.out.println(name);
}
br.close();
}
  
}
