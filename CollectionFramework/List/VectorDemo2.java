package CollectionFramework.List;

import java.util.Vector;

class Customer{
    private int cid;
    private String name;
    private int phoneNumber;
    private String address;
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Customer(int cid, String name, int phoneNumber, String address) {
        this.cid = cid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Customer [cid=" + cid + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
                + "]";
    }
    
}
public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<Customer> v=new Vector<>();
        v.add(new Customer(1, "Raghuram", 987585680, "Hyderabad"));
        v.add(new Customer(2, "hanumanth rao", 789878585, "Rangareddy"));
        v.add(new Customer(3, "HemanthReddy", 68987880, "Nizamabad"));
        for(Customer c:v){
            System.out.println(c.toString());
        }
    }
    
}
