package CollectionFramework.MapInterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeFinal 
{
public static void main(String[] args) throws IOException 
{
Map<String,String> nameMap=new HashMap<>(); 
Map<String,String> ageMap=new HashMap<>();
Map<String,String> salaryMap=new HashMap<>();   

BufferedReader br=new BufferedReader(new FileReader("merge1.csv"));
String line=br.readLine();
while((line=br.readLine())!=null){
    String[] lines=line.split(" ");
    String id=lines[0];
    String name=lines[1];
    nameMap.put(id, name);

}
br.close();

BufferedReader br1=new BufferedReader(new FileReader("merge2.csv"));
line=br1.readLine();
while((line=br1.readLine())!=null){
   String[] lines=line.split(" ");
    String id=lines[0];
    String age=lines[1];
    ageMap.put(id, age); 
}
br1.close();

BufferedReader br2=new BufferedReader(new FileReader("merge3.csv"));
line=br2.readLine();
while((line=br2.readLine())!=null){
   String[] lines=line.split(" ");
    String id=lines[0];
    String salary=lines[1];
    salaryMap.put(id, salary); 
}
br2.close();

 BufferedWriter bw = new BufferedWriter(new FileWriter("finalMerge.csv"));
            bw.write("id name age address\n");
            for (String id : nameMap.keySet()) {
                if (ageMap.containsKey(id) && salaryMap.containsKey(id)) {
                    String name = nameMap.get(id);
                    String age = ageMap.get(id);
                    String address = salaryMap.get(id);
                    bw.write(id + " " + name + " " + age + " " + address );
                    bw.newLine();
                }
            }
            bw.close();
            System.out.println("Final file has been created....");

    BufferedReader br4=new BufferedReader(new FileReader("finalMerge.csv"));
            String readMap=br4.readLine();
            while((readMap=br4.readLine())!=null){
                System.out.println(readMap);
            }
    }
}
