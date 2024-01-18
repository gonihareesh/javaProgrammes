package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo 
{
public static void main(String[] args) {
    Map<Integer,String> map=new HashMap<>();
    map.put(11, "Harish");
    map.put(12, "Damodar");
    map.put(13, "Digamber");
    System.out.println("key of map "+map.keySet());
    System.out.println("Value of map:"+map.values());
    for(int id:map.keySet()){
        String name=map.get(id);
        System.out.println(id+" "+name);
    }
}    
}
