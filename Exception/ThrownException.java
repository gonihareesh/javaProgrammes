package Exception;

public class ThrownException 
{
    public static void dividedZero(int number){
         number=23/0;
        throw new ArithmeticException("number is devided by zero"); 
    }
public static void main(String[] args) {
    dividedZero(25/0);
}    
}
