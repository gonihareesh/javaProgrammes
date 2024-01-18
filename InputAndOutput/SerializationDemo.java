package InputAndOutput;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Student extends Person{
  String course;
  int fee;
  Student(int id,String name,String course,int fee){
    super(id, name);
    this.course=course;
    this.fee=fee;
  }
}
public class SerializationDemo 
{
public static void main(String[] args) 
 {
 try
 {
    Student student=new Student(11, "Krishna", "Java", 5000);
    FileOutputStream fos=new FileOutputStream("demo8.txt");
    ObjectOutputStream out=new ObjectOutputStream(fos);
    out.writeObject(student);
    out.flush();
    out.close();
    System.out.println("Success");
 }catch(Exception e){
    System.out.println(e);
 }
 
 }   
}
