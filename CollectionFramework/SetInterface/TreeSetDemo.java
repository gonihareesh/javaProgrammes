package CollectionFramework.SetInterface;

import java.util.Iterator;

import java.util.TreeSet;

public class TreeSetDemo 
{
public static void main(String[] args) {
    TreeSet<String> ts=new TreeSet<>();
    ts.add("Harish");
    ts.add("Sandeep");
    ts.add("Roshan");
    ts.add("Anjaneyulu");
    Iterator<String> li=ts.iterator();
    while(li.hasNext()){
        System.out.println(li.next());
    }
}    
}
