package CollectionFramework.MapInterface;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
    public static void main(String[] args) throws IOException {
        Map<Integer,String> m=new HashMap<>();
        m.put(11, "Harish");
        m.put(12, "Sandeep");
        m.put(13, "Nishuruth");
        BufferedWriter bw=new BufferedWriter(new FileWriter("demo14.csv"));
        bw.write("id,name\n");
        for(int id:m.keySet()){
            String name=m.get(id);
            bw.write(id+" "+name);
            bw.newLine();
        }
        bw.close();
        System.out.println("file has been created..");
    }
    
}
