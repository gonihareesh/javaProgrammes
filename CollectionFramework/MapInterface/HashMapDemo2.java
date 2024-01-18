package CollectionFramework.MapInterface;

import java.util.HashMap;
import java.util.Map;

class Laptop{
    private int batchNo;
    private String brand;
    private double price;
    @Override
    public String toString() {
        return "Laptop [batchNo=" + batchNo + ", brand=" + brand + ", price=" + price + "]";
    }
    public Laptop(int batchNo, String brand, double price) {
        this.batchNo = batchNo;
        this.brand = brand;
        this.price = price;
    }
    
}
public class HashMapDemo2 
{
public static void main(String[] args) {
    Map<Integer,Laptop> map=new HashMap<>();
    map.put(1, new Laptop(15478, "Lenovo", 45000));
    map.put(2, new Laptop(15778, "Dell", 55000));
    map.put(3, new Laptop(16897, "Hp", 50000));
    for(Integer l:map.keySet()){
        Laptop data=map.get(l);
        System.out.println(l+" "+data);
    }

}    
}
