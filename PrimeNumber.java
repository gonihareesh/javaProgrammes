import java.util.Scanner;

public class PrimeNumber {
    public static void main(String1[] args) {
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number ");
        int num =s.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Enetr the number is prime :"+num);
        }else{
            System.out.println("Enter number is not prime number :"+num);
        }

    }
    
}
