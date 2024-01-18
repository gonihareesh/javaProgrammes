package CollectionFramework.SetInterface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

class Employee{
    private int eid;
    private String name;
    private String address;
    private String Domain;
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + ", address=" + address + ", Domain=" + Domain + "]";
    }
    public Employee(int eid, String name, String address, String domain) {
        this.eid = eid;
        this.name = name;
        this.address = address;
        Domain = domain;
    }
    
}
public class HashSetDemo4 
{
    public static void main(String[] args) throws IOException {
        HashSet<Employee> hs=new HashSet<>();
        hs.add(new Employee(1, "Adhvika", "Banswada", "Java Developer"));
        hs.add(new Employee(2, "Ammulu", "Bodhan", "Java Developer"));
        hs.add(new Employee(3, "navaneetha", "Hyderabad", "Salesforce Developer"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("demo12.csv"));
        bw.write("list of Employee ");
        for(Employee e:hs){
            bw.write(e.toString());
            bw.newLine();
        }
        bw.close();
        System.out.println("file has been created..");


        BufferedReader br=new BufferedReader(new FileReader("demo12.csv"));
        String names;
        while((names=br.readLine())!=null){
            System.out.println(names);
        }
    }
    
}
