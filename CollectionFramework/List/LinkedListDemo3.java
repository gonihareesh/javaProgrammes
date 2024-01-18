package CollectionFramework.List;

import java.util.LinkedList;

class Employee{
    private int eid;
    private String name;
    private String address;
    private int salary;
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
    }
    public Employee(int eid, String name, String address, int salary) {
        this.eid = eid;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    
}
public class LinkedListDemo3 
{
public static void main(String[] args) {
    LinkedList<Employee> list=new LinkedList<>();
    list.add(new Employee(11, "Krishna", "Mathura", 15000));
    list.add(new Employee(12, "Balaram", "vrundavan", 15000));
    list.add(new Employee(11, "Radha", "Gokul", 15000));
    for(Employee emp:list){
        System.out.println(emp.toString());
    }
}    
}
