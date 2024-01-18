package CollectionFramework.SetInterface;

import java.util.HashSet;

public class HashSetDemo1 
{
public static void main(String[] args) {
    HashSet<Integer> hs=new HashSet<>();
    hs.add(11);
    hs.add(22);
    hs.add(33);
    hs.add(44);
    for(Integer id:hs){
        System.out.println(id);
    }
}    
}
