package Exception;

public class StaticClass 
{
static int data=98;
static class Inner{
    void msg(){
        System.out.println("data is :"+data);
    }
}  
public static void main(String[] args) {
    StaticClass.Inner sc=new StaticClass.Inner();
    sc.msg();
}  
}
