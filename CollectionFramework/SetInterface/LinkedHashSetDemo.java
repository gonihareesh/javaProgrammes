package CollectionFramework.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo 
{
public static void main(String[] args) {
    LinkedHashSet<Integer> lh=new LinkedHashSet<>();
    lh.add(11);
    lh.add(12);
    lh.add(13);
    lh.add(14);
    for(Integer id:lh){
        System.out.println(id);
    }
}    
}
