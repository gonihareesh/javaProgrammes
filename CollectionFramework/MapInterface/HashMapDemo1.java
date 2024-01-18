package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 
{
public static void main(String[] args) {
    Map<Integer,String> map=new HashMap<>();
    map.put(111, "java");
    map.put(112, "Python");
    map.put(113, "Springboot");
    // Map.Entry interface contains the getKey() and getValue() methods
    for(Map.Entry m:map.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());

    }
}    
}
