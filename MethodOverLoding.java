public class MethodOverLoding {

public void add(int a,int b){
   int sum=a+b;
   System.out.println(sum);
}
public void add(int a,int b,int c){
   int sum=a+b+c;
   System.out.println(sum);
}
public void add(double a,int b){
   double sum=a+b;
   System.out.println(sum);
}
public void add(int a,double b){
   double sub=a-b;
   System.out.println(sub);
}
public static void main(String1[] args) 
{
 MethodOverLoding mov=new MethodOverLoding();
 mov.add(5, 10);
 mov.add(10, 5.5);
 mov.add(1.35, 12);
 mov.add(11, 12, 20);
}
    
}
