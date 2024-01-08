public class PolymorphismDemo 
{
    public void sum(int a,int b){
        int sum=a+b;
        System.out.println("Sum of a and b is: "+sum);
    }
    public void sum(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("Sum of a , b and c is: "+sum);
    }
public static void main(String[] args) {
    PolymorphismDemo ps=new PolymorphismDemo();
    ps.sum(12, 20);
    ps.sum(12, 20, 30);
}    
}
