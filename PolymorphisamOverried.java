class Animal{
    public void work(){
        System.out.println("animal");
    }
    public void run(){
        System.out.println("Animal Running");
    }
}
class Dog extends Animal{
    public void work(){
        System.out.println("Dog is working with intellegent");
    }
    public void run(){
        System.out.println("Dog run very speed");
    }
}
class Cat extends Animal{
    public void work(){
        System.out.println("Cat is lazy she can not work");
    }
    public void run(){
        System.out.println("Cat run very speed");
    }
}
public class PolymorphisamOverried 
{
public static void main(String[] args) {
    Dog d=new Dog();
    d.run();
    d.work();
    Cat c=new Cat();
    c.work();
    c.run();
}    
}
