import java.util.Scanner;

public class fibonacci {
    public static void main(String1[] args) {
        int count=4;
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr the first number:");
        int num1=s.nextInt();
        System.out.println("Enter the second number:");
        int num2=s.nextInt();
        System.out.println(num1+" "+num2);
        for(int i=0;i<count;i++){
            int n3=num1+num2;
            
            num1=num2;
            num2=n3;
            System.out.print(" "+n3);
        }
    }
    
}
