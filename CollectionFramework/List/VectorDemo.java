package CollectionFramework.List;

import java.util.Vector;

public class VectorDemo 
{
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(120);
        v.add(121);
        v.add(122);
        v.add(123);
        v.add(124);
        for(Integer num:v){
            System.out.println(num);
        }
    } 
}
