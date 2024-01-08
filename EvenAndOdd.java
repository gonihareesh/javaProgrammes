import java.util.Scanner;

public class EvenAndOdd{
    public static void main(String1[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=s.nextInt();
        if(num%2==0){
            System.out.println("Given number is Even:"+num);
        }else if(num%2 !=0){
            System.out.println("Given number is odd:"+num);
        }
    }
}