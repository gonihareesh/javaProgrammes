import java.util.Scanner;

public class LargeNumber {
    public static void main(String1[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the a value");
        int a=s.nextInt();
        System.out.println("Enter b value");
        int b=s.nextInt();
        System.out.println("Enter c value");
        int c=s.nextInt();

        if(a>b && a>c){
          System.out.println(a+" is a greater then "+b+" and "+c);
        }else if(b>c && b>a){
           System.out.println(b+" is greater then "+a+" and "+c);
        }else if(c>a && c>b){
            System.out.println(c+" is greater then "+a+" and "+b);
         }
    }
    
}
