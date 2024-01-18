package CollectionFramework.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 
{
public static void main(String[] args) {
    LinkedHashSet<String> lh=new LinkedHashSet<>();
    lh.add("Rama");
    lh.add("Krishna");
    lh.add("Narasimha");
    lh.add("Vamana");
    for(String name:lh){
        System.out.println(name);
    }
}    
}
