package CollectionFramework.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 
{
public static void main(String[] args) {
    Vector<String> v=new Vector<>();
    v.add("Rekha");
    v.add("Ramana");
    v.add("ramu");
    v.add("radha");
    Iterator ii=v.iterator();
    while(ii.hasNext()){
         System.out.println(ii.next());
    } 
}    
}
