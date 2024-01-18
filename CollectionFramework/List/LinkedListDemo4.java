package CollectionFramework.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo4 
{
public static void main(String[] args) {
    LinkedList<Integer> li=new LinkedList<>();
    li.add(111);
    li.add(112);
    li.add(113);
    li.add(114);
    Iterator ii=li.iterator();
    while(ii.hasNext())
    System.out.println(ii.next());
}    
}
