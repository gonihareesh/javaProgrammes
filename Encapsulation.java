public class Encapsulation 
{
  private int id;
  private String name;
  private String address;
  private  double salary;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
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
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    this.salary = salary;
}
@Override
public String toString() {
    return "Encapsulation [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}
public Encapsulation(int id, String name, String address, double salary) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.salary = salary;
}
public static void main(String[] args) {
    Encapsulation e=new Encapsulation(11, "Harish", "Nizamabad", 10000);
    Encapsulation e1=new Encapsulation(12, "Rakesh", "Karimnagar", 15000);
    Encapsulation e2=new Encapsulation(13, "Eswar", "Vijayawada", 20000);

    System.out.println(e);
    System.out.println(e1);
    System.out.println(e2);
}
}

