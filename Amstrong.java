import java.util.Scanner;

public class Amstrong {
    public static void main(String1[] args) {
        int result=0,remainder ,originalnumber;
        Scanner s=new Scanner(System.in);
        System.out.println("Enetr the number ");
        int num=s.nextInt();
        originalnumber=num;
        while(originalnumber!=0){
            remainder=originalnumber%10;
            result=result+(remainder*remainder*remainder);
            originalnumber=originalnumber/10;
        }
        if(result==num)
            System.out.println(num+" is an Amstrong:");
        else{
            System.out.println(num+" is an not Amstrong:");
        }

    }
    
}
