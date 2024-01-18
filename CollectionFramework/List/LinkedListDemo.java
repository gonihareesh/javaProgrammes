package CollectionFramework.List;

import java.util.LinkedList;

public class LinkedListDemo 
{
public static void main(String[] args) {
    LinkedList<Integer> list=new LinkedList<>();
    list.add(101);
    list.add(102);
    list.add(103);
    list.add(104);
    for(Integer number:list){
        System.out.println(number);
    }
}    
}
