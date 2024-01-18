package CollectionFramework.SetInterface;

import java.util.HashSet;

public class HashSetDemo 
{
public static void main(String[] args) {
    HashSet<String> hs=new HashSet<>();
    hs.add("Java");
    hs.add("Python");
    hs.add("Spring boot");
    hs.add("Salesforce");
    for(String course:hs){
        System.out.println(course);
    }
}    
}
