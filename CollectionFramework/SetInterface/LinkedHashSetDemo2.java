package CollectionFramework.SetInterface;

import java.util.LinkedHashSet;
class Customer{
    private int id;
    private String name;
    private String address;
    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", address=" + address ;
    }
    
}

public class LinkedHashSetDemo2 
{
public static void main(String[] args) {
    LinkedHashSet<Customer> lh=new LinkedHashSet<>();
    lh.add(new Customer(1, "Mohan", "nizamabad"));
    lh.add(new Customer(2, "manoj", "Medak"));
    lh.add(new Customer(3, "Santhos", "Kamareddy"));
    for(Customer c:lh){
        System.out.println(c.toString());
    }
}    
}
