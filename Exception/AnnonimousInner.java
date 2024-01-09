package Exception;
abstract class Person{
    abstract void eat();
}
public class AnnonimousInner 
{
    public static void main(String[] args) {
        Person p=new Person() {
            void eat(){
                System.out.println("Person is like to eat fruits");
            }
        };
    p.eat();
    }
}
