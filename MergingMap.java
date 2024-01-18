package CollectionFramework.MapInterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergingMap 
{
public static void main(String[] args) throws IOException {
    BufferedWriter bw=new BufferedWriter(new FileWriter("merge1.csv"));
    bw.write("id,name\n");
    Map<Integer,String> merg1=new HashMap<>();
    merg1.put(11, "Naresh");
    merg1.put(12, "Ramesh");
    merg1.put(13, "Mahesh");
    for(int id:merg1.keySet()){
        String name=merg1.get(id);
        bw.write(id+" "+name);
        bw.newLine();
    }
    bw.close();
    System.out.println("first file has been created..");

    BufferedWriter bw1=new BufferedWriter(new FileWriter("merge2.csv"));
    bw1.write("id,age\n");
    Map<Integer,Integer> merg2=new HashMap<>();
    merg2.put(11, 28);
    merg2.put(12, 27);
    merg2.put(13, 25);
    for(int id:merg2.keySet()){
        int age=merg2.get(id);
        bw1.write(id+" "+age);
        bw1.newLine();
    }
    bw1.close();
    System.out.println("second file has been created..");


     BufferedWriter bw3=new BufferedWriter(new FileWriter("merge3.csv"));
    bw3.write("id salary\n");
    Map<Integer,Integer> merg3=new HashMap<>();
    merg3.put(11, 35000);
    merg3.put(12, 27000);
    merg3.put(13, 25000);
    for(int id:merg3.keySet()){
        int salary=merg3.get(id);
        bw3.write(id+" "+salary);
        bw3.newLine();
    }
    bw3.close();
    System.out.println("third file has been created..");
}    
}
