package CollectionFramework.SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo3 
{
public static void main(String[] args) {
    LinkedHashSet<Integer> l=new LinkedHashSet<>();
    l.add(111);
    l.add(112);
    l.add(113);
    l.add(114);
    Iterator<Integer> li=l.iterator();
    while(li.hasNext()){
        System.out.println(li.next());
    }
}    
}
