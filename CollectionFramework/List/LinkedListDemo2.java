package CollectionFramework.List;

import java.util.LinkedList;

public class LinkedListDemo2 
{
public static void main(String[] args) {
    LinkedList<String> list=new LinkedList<>();
    list.add("Krishna");
    list.add("Rama");
    list.add("Laxman");
    list.add("Balaram");
    for(String names:list){
        System.out.println(names);
    }
}    
}
