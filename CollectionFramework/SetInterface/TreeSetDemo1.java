package CollectionFramework.SetInterface;

import java.util.TreeSet;

public class TreeSetDemo1 
{
public static void main(String[] args) {
    TreeSet<Integer> set=new TreeSet<>();
    set.add(10);
    set.add(11);
    set.add(12);
    set.add(13);
    for(Integer i:set){
        System.out.println(i);
    }

}    
}
