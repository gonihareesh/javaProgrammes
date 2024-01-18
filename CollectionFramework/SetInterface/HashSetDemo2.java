package CollectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo2 
{
public static void main(String[] args) {
    Set<Integer> s=new HashSet<>();
    s.add(111);
    s.add(112);
    s.add(113);
    s.add(114);
    Iterator ii=s.iterator();
    while(ii.hasNext()){
        System.out.println(ii.next());
    }
}    
}
